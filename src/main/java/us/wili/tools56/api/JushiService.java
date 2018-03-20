package us.wili.tools56.api;

import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.model.BaseModel;
import us.wili.tools56.model.req.BaseReq;

/**
 * Created by JasonY on 18/3/20.
 */
public interface JushiService {

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的GET请求
     */
    <T> T get(BaseReq req) throws JushiErrorException;

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的GET请求
     */
    <T> T post(BaseReq req) throws JushiErrorException;




}
