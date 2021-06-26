package cn.tobdev.qy.weixin.sdk.constant;

/**
 * OA 和 效率工具 api uri 常量
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/90261
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/93623
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface OaApiUris {

    // 客户管理
    String API_CUSTOMER_LIST = "GET /externalcontact/list";

    // 电子发票
    String API_INVOICE_GET = "POST /card/invoice/reimburse/getinvoiceinfo";
    String API_INVOICE_GET_BATCH = "POST /card/invoice/reimburse/getinvoiceinfobatch";
    String API_INVOICE_UPDATE = "POST /card/invoice/reimburse/updateinvoicestatus";
    String API_INVOICE_UPDATE_BATCH = "POST /card/invoice/reimburse/updatestatusbatch";

}
