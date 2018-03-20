package us.wili.tools56.api;

import us.wili.tools56.model.req.account.CreateAccountReq;
import us.wili.tools56.model.resp.account.CreateAccountRespDto;

/**
 * Created by JasonY on 18/3/20.
 */
public interface AccountService {

    CreateAccountRespDto createAccountP(CreateAccountReq req);

}
