package us.wili.tools56.api;

import us.wili.tools56.model.req.assets.AssetsEnrollReq;
import us.wili.tools56.model.req.assets.AssetsQueryReq;
import us.wili.tools56.model.req.assets.AssetsRevokeReq;
import us.wili.tools56.model.resp.assets.AssetsEnrollResp;
import us.wili.tools56.model.resp.assets.AssetsQueryResp;
import us.wili.tools56.model.resp.assets.AssetsRevokeResp;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface AssetsService {
    AssetsEnrollResp assetsEnroll(AssetsEnrollReq req);

    AssetsRevokeResp assetsRevoke(AssetsRevokeReq req);

    AssetsQueryResp assetsQuery(AssetsQueryReq req);
}
