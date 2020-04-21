package com.yqbing.servicebing.webapp.response;

public class TradeFundBill {
	 public String fund_channel;//	String	是	32	交易使用的资金渠道，详见支付渠道列表	ALIPAYACCOUNT
	  public Object amount;//	Price	是	32	该支付工具类型所使用的金额	10
	  public Object real_amount;//	Price	否	11	渠道实际付款金额	11.21
	  public String fund_type;//	String	否	32	渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息(DEBIT_CARD:借记卡,CREDIT_CARD:信用卡,MIXED_CARD:借贷合一卡)	DEBIT_CARD

	  public String getFund_channel() {
			return fund_channel;
		}
		public void setFund_channel(String fund_channel) {
			this.fund_channel = fund_channel;
		}
		public Object getAmount() {
			return amount;
		}
		public void setAmount(Object amount) {
			this.amount = amount;
		}
		public Object getReal_amount() {
			return real_amount;
		}
		public void setReal_amount(Object real_amount) {
			this.real_amount = real_amount;
		}
		public String getFund_type() {
			return fund_type;
		}
		public void setFund_type(String fund_type) {
			this.fund_type = fund_type;
		}
}
