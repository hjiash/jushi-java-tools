package us.wili.tools56.util.crypto;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;

/**
 * 签名工具类，用于对报文进行加签名
 *
 * @author JasonY
 */
public class SignUtil {
	public static final String CHARSET = "UTF-8";
	private String key;
	private String secret;
	private String md5Key;

	public SignUtil(){}

	public SignUtil(String key, String secret) {
		this.key = key;
		this.secret = secret;
		init();
	}

	protected void init() {
		try {
			this.md5Key = DigestUtils.md5DigestAsHex((this.key + this.secret).getBytes(CHARSET));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("不支持该编码格式", e);
		}
	}

	public String toString(Map<String, Object> body) {
		return serializeMap(body);
	}

	public String sign(String plainText) {
		try {
			return DigestUtils.md5DigestAsHex((plainText + this.md5Key).getBytes(CHARSET));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("不支持该编码格式", e);
		}
	}

	public String sign(Map<String, Object> body) {
		String raw = serializeMap(body);
		return sign(raw);
	}

	/**
	 * 对所有的属性元算采用key1=value1&key2=value2&key3=value3的形式进行拼接
	 * 形成一个完整的对象格式化序列serialize
	 *
	 * @param requestBody
	 * @return
	 */
	protected String serializeMap(Map<String, Object> requestBody) {
		requestBody.remove("sign");
		TreeSet<String> sortedKey = new TreeSet<String>(requestBody.keySet());

		StringBuilder builer = new StringBuilder();
		for(String key : sortedKey) {
			builer.append(key).append("=").append(serializeObject(requestBody.get(key))).append("&");
		}

		String result = builer.toString();
		return result.substring(0, result.length() - 1);
	}

	/**
	 * 对于对象中除签名域(sign)之外的所有key值进行alphabet序进行排序。
	 * 如果是简单格式则采用key=value的形式对该属性进行描述。
	 * 如果是对象，则递归使用该规则；
	 * 如果是简单数组，则采用key=value1&value2&value3的形式进行描述；
	 * 如果是对象数组，则依序对对象递归使用该规则，并依照数组顺序对该对象的序列化格式进行key=serial1&seril2&serial3的形式进行描述。
	 *
	 * @param obj
	 * @return
	 */
	protected String serializeObject(Object obj) {
		if(obj == null) {
			return "";
		}

		if (obj.getClass().isPrimitive() || obj.getClass() == String.class) {
			return String.valueOf(obj);
		} else if (obj instanceof Collection) {
			StringBuilder builder = new StringBuilder();

			for (Object _obj : (Collection) obj) {
				builder.append(serializeObject(_obj)).append("&");
			}

			String result = builder.toString();
			return result.substring(0, result.length() - 1);
		} else if (obj instanceof Map) {
			return serializeMap((Map) obj);
		} else if (obj.getClass().isArray()) {
			return StringUtils.arrayToDelimitedString((Object[]) obj, "&");
		} else {
			return String.valueOf(obj);
		}
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
		init();
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
		init();
	}
}
