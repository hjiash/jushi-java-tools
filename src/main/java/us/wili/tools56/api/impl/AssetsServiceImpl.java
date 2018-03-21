package us.wili.tools56.api.impl;

import us.wili.tools56.api.AssetsService;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.model.req.assets.AssetsEnrollReq;
import us.wili.tools56.model.req.assets.AssetsQueryReq;
import us.wili.tools56.model.req.assets.AssetsRevokeReq;
import us.wili.tools56.model.resp.assets.AssetsEnrollResp;
import us.wili.tools56.model.resp.assets.AssetsQueryResp;
import us.wili.tools56.model.resp.assets.AssetsRevokeResp;

/**
 * Created by lhyue on 2018/3/21.
 */
public class AssetsServiceImpl implements AssetsService {

    private JushiService jushiService;

    public AssetsServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public AssetsEnrollResp assetsEnroll(AssetsEnrollReq req) {
        return jushiService.postUseApi(req, AssetsEnrollResp.class);
    }

    @Override
    public AssetsRevokeResp assetsRevoke(AssetsRevokeReq req) {
        return jushiService.postUseApi(req, AssetsRevokeResp.class);
    }

    @Override
    public AssetsQueryResp assetsQuery(AssetsQueryReq req) {
        return jushiService.postUseApi(req, AssetsQueryResp.class);
    }
}
