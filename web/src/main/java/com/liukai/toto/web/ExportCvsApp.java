package com.liukai.toto.web;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by liukai on 2017/6/6.
 */
public class ExportCvsApp {

//  static void writeCsv(List<ExportItem> exportRespItems, OutputStream outputStream) throws
//      IOException {
//    CsvWriter csvWriter = new CsvWriter(outputStream, ',', Charset.forName("GBK"));
//    csvWriter.write("指派者");
//    csvWriter.write("卡号");
//    csvWriter.write("卡主人");
//    csvWriter.write("订单号");
//    csvWriter.write("代买单号");
//    csvWriter.write("币种");
//    csvWriter.write("汇率");
//    csvWriter.write("实付金额(客户支付的实际金额+补款-退款的最后金额)");
//    csvWriter.write("实付代买金额(LOOK实付金额)");
//    csvWriter.write("运费(运费+转运费)");
//    csvWriter.write("电商平台");
//    csvWriter.write("补款金额");
//    csvWriter.write("退款金额");
//    csvWriter.write("用户付的实际运费");
//    csvWriter.write("用户付的实际转运费");
//    csvWriter.write("LOOK付的转运费");
//    csvWriter.write("关税险");
//    csvWriter.write("关税险报销");
//    csvWriter.write("订单状态");
//    csvWriter.write("代买状态");
//    csvWriter.write("支付状态");
//    csvWriter.write("代买凭证");
//    csvWriter.write("时间");
//    csvWriter.write("是否结算(Y/N)");
//    csvWriter.endRecord();
//
//    for (ExportItem item : exportRespItems) {
//      csvWriter.write(item.getOperator());
//      csvWriter.write(item.getCard_number());
//      csvWriter.write(item.getCard_owner());
//      csvWriter.write("os_"+item.getOrder_sn());
//      csvWriter.write("hb_"+item.getHelpbuy_sn());
//      csvWriter.write(item.getCurrency());
//      csvWriter.write(item.getExchangeRate());
//      csvWriter.write(item.getUser_pay_amount());
//      csvWriter.write(item.getLook_pay_amount());
//      csvWriter.write(item.getFreight());
//      csvWriter.write(item.getSite());
//      csvWriter.write(item.getSup_amount());
//      csvWriter.write(item.getRefund_amount());
//      csvWriter.write(item.getUser_paid_freight());
//      csvWriter.write(item.getUser_paid_transfer_freight());
//      csvWriter.write(item.getLook_paid_transfer_freight());
//      csvWriter.write(item.getTariffs_on_insurance());
//      csvWriter.write(item.getTariffs_for_reimbursement());
//      csvWriter.write(OrderStatus.getDesc(item.getOrder_status()));
//      csvWriter.write(HelpbuyStatus.getDesc(item.getHelpbuy_status()));
//      csvWriter.write(PayStatus.getDesc(item.getPay_status()));
//      csvWriter.write(item.getHelpbuy_img().toString());
//      csvWriter.write(item.getCreate_time());
//      csvWriter.write(item.getHasSettled());
//      csvWriter.endRecord();
//    }
//    csvWriter.close();
//    outputStream.close();
//
//  }
//
//  public static void main(String[] args) {
//
//    String fileName = "/Users/liukai/Downloads/2017-04-01~2017-06-05export.csv";
//    //    File file = new File("/Users/liukai/Downloads/2017-04-01~2017-06-05export.json");
//    File file = new File("/Users/liukai/Downloads/oneline.json");
//    BufferedReader reader = null;
//    BufferedOutputStream outputStream = null;
//    try {
//      reader = new BufferedReader(new FileReader(file));
//      StringBuilder sb = new StringBuilder();
//      String line;
//      while ((line = reader.readLine()) != null) {
//        sb.append(line);
//      }
//
//      List<ExportItem> items =
//          JSONArray.parseArray(sb.toString(), ExportItem.class);
//
//      outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
//      writeCsv(items, outputStream);
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      if(reader != null){
//        try {
//          reader.close();
//        } catch (IOException e) {
//        }
//      }
//      if(outputStream != null){
//        try {
//          outputStream.close();
//        } catch (IOException e) {
//        }
//      }
//    }
//
//  }
//
//  static class ExportItem {
//
//    //  指派者
//    String operator;
//    //  卡号
//    String card_number;
//    //  卡主人
//    String card_owner ;
//    //  订单号
//    String order_sn ;
//    //  代买单号
//    String helpbuy_sn;
//    //  币种
//    String currency ;
//    //  汇率
//    String exchangeRate ;
//    //  实付金额(客户支付的实际金额+补款-退款的最后金额)
//    String user_pay_amount ;
//    //  实际代买价格(LOOK实付金额)
//    String look_pay_amount;
//    //  运费(运费+转运费)
//    String freight ;
//    //  电商平台
//    String site ;
//    // 补款金额
//    String sup_amount;
//    // 退款金额
//    String refund_amount;
//    // 用户付的实际运费
//    String user_paid_freight;
//    // 用户付的实际转运费
//    String user_paid_transfer_freight;
//    // LOOK付的转运费
//    String look_paid_transfer_freight;
//    // 关税险
//    String tariffs_on_insurance;
//    // 关税险报销
//    String tariffs_for_reimbursement;
//    //  订单状态
//    int order_status;
//    //  代买状态
//    int helpbuy_status;
//    //  支付状态
//    int pay_status ;
//    //  代买凭证(图片url)
//    List<String> helpbuy_img ;
//    //  时间
//    String create_time ;
//    //  是否已结算(Y/N)
//    String hasSettled;
//
//    public String getOperator() {
//      return operator;
//    }
//
//    public void setOperator(String operator) {
//      this.operator = operator;
//    }
//
//    public String getCard_number() {
//      return card_number;
//    }
//
//    public void setCard_number(String card_number) {
//      this.card_number = card_number;
//    }
//
//    public String getCard_owner() {
//      return card_owner;
//    }
//
//    public void setCard_owner(String card_owner) {
//      this.card_owner = card_owner;
//    }
//
//    public String getOrder_sn() {
//      return order_sn;
//    }
//
//    public void setOrder_sn(String order_sn) {
//      this.order_sn = order_sn;
//    }
//
//    public String getHelpbuy_sn() {
//      return helpbuy_sn;
//    }
//
//    public void setHelpbuy_sn(String helpbuy_sn) {
//      this.helpbuy_sn = helpbuy_sn;
//    }
//
//    public String getCurrency() {
//      return currency;
//    }
//
//    public void setCurrency(String currency) {
//      this.currency = currency;
//    }
//
//    public String getExchangeRate() {
//      return exchangeRate;
//    }
//
//    public void setExchangeRate(String exchangeRate) {
//      this.exchangeRate = exchangeRate;
//    }
//
//    public String getUser_pay_amount() {
//      return user_pay_amount;
//    }
//
//    public void setUser_pay_amount(String user_pay_amount) {
//      this.user_pay_amount = user_pay_amount;
//    }
//
//    public String getLook_pay_amount() {
//      return look_pay_amount;
//    }
//
//    public void setLook_pay_amount(String look_pay_amount) {
//      this.look_pay_amount = look_pay_amount;
//    }
//
//    public String getFreight() {
//      return freight;
//    }
//
//    public void setFreight(String freight) {
//      this.freight = freight;
//    }
//
//    public String getSite() {
//      return site;
//    }
//
//    public void setSite(String site) {
//      this.site = site;
//    }
//
//    public String getSup_amount() {
//      return sup_amount;
//    }
//
//    public void setSup_amount(String sup_amount) {
//      this.sup_amount = sup_amount;
//    }
//
//    public String getRefund_amount() {
//      return refund_amount;
//    }
//
//    public void setRefund_amount(String refund_amount) {
//      this.refund_amount = refund_amount;
//    }
//
//    public String getUser_paid_freight() {
//      return user_paid_freight;
//    }
//
//    public void setUser_paid_freight(String user_paid_freight) {
//      this.user_paid_freight = user_paid_freight;
//    }
//
//    public String getUser_paid_transfer_freight() {
//      return user_paid_transfer_freight;
//    }
//
//    public void setUser_paid_transfer_freight(String user_paid_transfer_freight) {
//      this.user_paid_transfer_freight = user_paid_transfer_freight;
//    }
//
//    public String getLook_paid_transfer_freight() {
//      return look_paid_transfer_freight;
//    }
//
//    public void setLook_paid_transfer_freight(String look_paid_transfer_freight) {
//      this.look_paid_transfer_freight = look_paid_transfer_freight;
//    }
//
//    public String getTariffs_on_insurance() {
//      return tariffs_on_insurance;
//    }
//
//    public void setTariffs_on_insurance(String tariffs_on_insurance) {
//      this.tariffs_on_insurance = tariffs_on_insurance;
//    }
//
//    public String getTariffs_for_reimbursement() {
//      return tariffs_for_reimbursement;
//    }
//
//    public void setTariffs_for_reimbursement(String tariffs_for_reimbursement) {
//      this.tariffs_for_reimbursement = tariffs_for_reimbursement;
//    }
//
//    public int getOrder_status() {
//      return order_status;
//    }
//
//    public void setOrder_status(int order_status) {
//      this.order_status = order_status;
//    }
//
//    public int getHelpbuy_status() {
//      return helpbuy_status;
//    }
//
//    public void setHelpbuy_status(int helpbuy_status) {
//      this.helpbuy_status = helpbuy_status;
//    }
//
//    public int getPay_status() {
//      return pay_status;
//    }
//
//    public void setPay_status(int pay_status) {
//      this.pay_status = pay_status;
//    }
//
//    public List<String> getHelpbuy_img() {
//      return helpbuy_img;
//    }
//
//    public void setHelpbuy_img(List<String> helpbuy_img) {
//      this.helpbuy_img = helpbuy_img;
//    }
//
//    public String getCreate_time() {
//      return create_time;
//    }
//
//    public void setCreate_time(String create_time) {
//      this.create_time = create_time;
//    }
//
//    public String getHasSettled() {
//      return hasSettled;
//    }
//
//    public void setHasSettled(String hasSettled) {
//      this.hasSettled = hasSettled;
//    }
//  }
//
//  enum OrderStatus {
//    ORDER_STATUS_CREATE(0,"订单创建"),
//    ORDER_STATUS_WAITE_PAY(1,"订单待付款"),
//    ORDER_STATUS_PROCESING(2,"订单处理中"),
//    ORDER_STATUS_CANCAL(3,"订单取消"),
//    ORDER_STATUS_FINISH(4,"订单完成"),
//    ORDER_STATUS_CLOSE(5,"交易关闭");
//
//    int code;
//    String desc;
//
//    OrderStatus(int code, String desc) {
//      this.code = code;
//      this.desc = desc;
//    }
//
//    public static String getDesc(int code){
//      for (OrderStatus status : OrderStatus.values()){
//        if(status.code == code){
//          return status.desc;
//        }
//      }
//      return "";
//    }
//  }
//
//  enum PayStatus {
//    PAY_STATUS_WAITE_PAY(0,"待支付"),
//    PAY_STATUS_HAV_PAY(1,"已付款"),
//    PAY_STATUS_REC_PAY(2,"已到账"),
//    PAY_STATUS_SUP_ING(3,"补款中"),
//    PAY_STATUS_SUP_PART(4,"补款部分"),
//    PAY_STATUS_SUP_ALL(5,"补款所有"),
//    PAY_STATUS_REFUND_ING(6,"退款中"),
//    PAY_STATUS_REFUND_PART(7,"退款部分"),
//    PAY_STATUS_REFUND_ALL(8,"全部退款");
//
//    int code;
//    String desc;
//
//    PayStatus(int code, String desc) {
//      this.code = code;
//      this.desc = desc;
//    }
//
//    public static String getDesc(int code){
//      for (OrderStatus status : OrderStatus.values()){
//        if(status.code == code){
//          return status.desc;
//        }
//      }
//      return "";
//    }
//  }
//
//  enum HelpbuyStatus {
//    HELPBUY_STATUS_NONE(0,"未知"),
//    HELPBUY_STATUS_ING(1,"代买进行中"),
//    HELPBUY_STATUS_SUC(2,"代买成功"),
//    HELPBUY_STATUS_FAIL(3,"代买失败");
//
//    int code;
//    String desc;
//
//    HelpbuyStatus(int code, String desc) {
//      this.code = code;
//      this.desc = desc;
//    }
//
//    public static String getDesc(int code){
//      for (OrderStatus status : OrderStatus.values()){
//        if(status.code == code){
//          return status.desc;
//        }
//      }
//      return "";
//    }
//  }

}
