package us.wili.tools56.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by JasonY on 18/3/20.
 */
public abstract class BaseModel implements Serializable {
    /**
     * 需要参与签名的属性，构造Map
     *
     * @return
     */
    public abstract Map<String, Object> toMap();

    /**
     * 生成签名
     *
     * @return
     */
//    public String rawSignString() {
//        return serializeMap(toMap());
//    }


}
