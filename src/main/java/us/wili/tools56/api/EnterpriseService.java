package us.wili.tools56.api;

import us.wili.tools56.model.req.enterprise.EnterpriseAddReq;
import us.wili.tools56.model.resp.enterprise.EnterpriseAddResp;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface EnterpriseService {
    EnterpriseAddResp enterpriseAdd(EnterpriseAddReq req);
}
