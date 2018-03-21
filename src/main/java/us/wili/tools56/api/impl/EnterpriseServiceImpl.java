package us.wili.tools56.api.impl;

import us.wili.tools56.api.EnterpriseService;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.model.req.enterprise.EnterpriseAddReq;
import us.wili.tools56.model.resp.enterprise.EnterpriseAddResp;

/**
 * Created by lhyue on 2018/3/21.
 */
public class EnterpriseServiceImpl implements EnterpriseService {

    private JushiService jushiService;

    public EnterpriseServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public EnterpriseAddResp enterpriseAdd(EnterpriseAddReq req) {
        return jushiService.postUseApi(req, EnterpriseAddResp.class);
    }
}
