package us.wili.tools56.util.crypto;

import org.apache.commons.codec.binary.Base64;
import org.omg.SendingContext.RunTime;
import org.springframework.util.Base64Utils;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.exception.JushiToolsErrorException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.nio.charset.Charset;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * RSA加密工具类，用于对报文进行加解密
 *
 * @author JasonY
 */
public class CryptoUtil {
    public static final String KEY_ALGORITHM = "RSA";
    public static final String CHARSET = "UTF-8";
    // RSA最大加密明文大小
    private static final int MAX_ENCRYPT_BLOCK = 245;
    // RSA最大解密密文大小
    private static final int MAX_DECRYPT_BLOCK = 256;

    private String publicKeyPath;
    private String privateKeyPath;

    // 没有 set 方法
    private PublicKey publicKey;
    private PrivateKey privateKey;

    public CryptoUtil() {}

    public CryptoUtil(String publicKeyPath, String privateKeyPath) {
        this.publicKeyPath = publicKeyPath;
        this.privateKeyPath = privateKeyPath;

        getPublicKey();
        getPrivateKey();
    }

    private String getKeyContent(String keyPath) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(keyPath)));
            String readLine = null;
            StringBuilder sb = new StringBuilder();

            while ((readLine = br.readLine()) != null) {
                if (readLine.charAt(0) == '-') {
                    continue;
                } else {
                    sb.append(readLine);
                    sb.append('\r');
                }
            }

            return sb.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("配置文件不存在", e);
        } catch (IOException e) {
            throw new RuntimeException("读取文件数据失败", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭输入流失败", e);
                }
            }
        }
    }

    /**
     * @return PublicKey
     * @Title: getPublicKey
     * @Description: 将字符串型公钥转化为PublicKey Java
     */
    public PublicKey getPublicKey() {
        if (this.publicKey != null) {
            return publicKey;
        }

        String publicKeyContent = getKeyContent(this.publicKeyPath);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyContent));

        try {

            KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
            PublicKey publicKey = factory.generatePublic(x509EncodedKeySpec);
            this.publicKey = publicKey;

            return publicKey;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("不存在该算法", e);
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException("key值不合法，请检查配置", e);
        }
    }

    /**
     * @return PrivateKey
     * @Description: 将字符串型私钥转化为 PrivateKey Java
     */
    public PrivateKey getPrivateKey() {
        if (privateKey != null) {
            return privateKey;
        }

        String privateKeyContent = getKeyContent(this.privateKeyPath);
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKeyContent));

        try {
            KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
            PrivateKey privateKey = factory.generatePrivate(pkcs8EncodedKeySpec);
            this.privateKey = privateKey;

            return privateKey;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("不存在该算法", e);
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException("key值不合法，请检查配置", e);
        }
    }

    public String encode(String plainText) {
        if (StringUtils.isEmpty(plainText)) {
            throw new JushiToolsErrorException("待签名数据不可为空");
        }

        try {
            byte[] b = plainText.getBytes(CHARSET);
            int inputLen = b.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;
            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, getPublicKey());

            // 对数据分段解密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                    cache = cipher.doFinal(b, offSet, MAX_ENCRYPT_BLOCK);
                } else {
                    cache = cipher.doFinal(b, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_ENCRYPT_BLOCK;
            }

            byte[] decryptedData = out.toByteArray();
            out.close();
            return Base64Utils.encodeToString(decryptedData);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("key值不合法，请检查配置", e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("不存在该算法", e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException("待签名数据读取失败", e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param encodedText
     * @return String
     * @Title: RSADecode
     * @Description: 将字符串解密
     */
    public String decode(String encodedText) {
        try {
            byte[] b = Base64Utils.decodeFromString(encodedText);
            int inputLen = b.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;

            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, getPrivateKey());
            // 对数据分段解密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                    cache = cipher.doFinal(b, offSet, MAX_DECRYPT_BLOCK);
                } else {
                    cache = cipher.doFinal(b, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_DECRYPT_BLOCK;
            }

            byte[] decryptedData = out.toByteArray();
            out.close();
            return new String(decryptedData);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("key值不合法，请检查配置", e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("不存在该算法", e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }
}
