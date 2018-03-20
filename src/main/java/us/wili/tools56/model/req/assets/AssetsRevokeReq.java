package us.wili.tools56.model.req.assets;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsRevokeReq extends BaseReqDto {
    @ApiModelProperty(value = "标的编号，必填，由产品的发行方定义；需保证唯一性，限定40各字符", required = true)
    private String asset_no;
    @ApiModelProperty(value = "借款人电子账号，必填，限定19个字符", required = true)
    private String card_no;
    @ApiModelProperty(value = "借款金额，必填，两位小数，限定13个字符", required = true)
    private String amount;

    @Length(max = 40, message = "标的编号最多40个字符")
    @NotBlank(message = "标的编号不能为空")
    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    @Length(max = 19, min = 19, message = "借款人电子账号应等于19个字符")
    @NotBlank(message = "借款人电子账号不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "借款金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "借款金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
