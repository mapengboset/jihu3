package com.yqbing.servicebing.webapp.alipay;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：1.0
 *日期：2016-06-06
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	//合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
//	public static String partner = "2088811210202425";
	public static String app_id = "2018120462475299";

	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	public static String private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCWJA/pKxZzf2S1LJ9NW4bZ0dDP2xdkOXh16HDWMPLOsexquUsTw6TiqfP6fJnI9Wb3gl8uv3nRqUuu/8Fxz4jYJ/yu7EfdUe6jhhUXQRkrTxdf8XmLnysSkaeR/TqA7+BGmpvRPrb8RQsjEVoTBYJjpUPU1GCsy5voclHy2EB0PJlFK5Wdam2Tum5Fb1bbkwibyC2rN43wz+H3UAXT+4ZzBGIDjl8IFokqLE66qqK9+27JmyAkx0Cg+cRrF01sasD76o/YVEPiyh1p+6pk2BMnhCiY7tVV742lJKOck4XEFJIShSFd+jHCBVqI3Qng9kqyup6oXFg8tDefzgh9FNQlAgMBAAECggEACor5uwvVhcK6VaaOgSYeMAl1ukLOP7FxbgYmdkP1qOIBkfT0+qxQVcJNaZd6TQw+cL7s5CF58mkK8XzwHofOOi+EpNveqAHq2fy+WmWt2MazA3+3Y0CIC8PCmpPHmeo+O3b73hOjUc+fWpULWC6Y21ptivJm33tktUvhyUW6MO88rwtp2V8Mc6jkmd+wL5BRQ34SbYBZtDrlhmrReJZolqDQnu2i5poC7OsCUtClxFay9qmblBlE23NrRo2eVyb63p1Ww0jyzgmmo4Uo4CpfZ303fNusNz109E8SZU1xmzLm6z0XldXy28ZwVNwzdViTRdlQZ8YR3yzNMF60oQ1XwQKBgQDdcT2n+FRr17Lz7wZGerw4I7uxnqFxf4i1YbXQ+AqvTpZWU7YsGD2A/Ud32zfZl5gLyxWK4IAwJyb2iYYoBnvDC+D5Bksv+QI/A69WiDvNof/h3jjHf3bGZTJ6t0ekVWneAcpH5WYUFgD/l2tCUy/FMiarZFpou5fV+sS8zVkTaQKBgQCtkkhw4h2U/3ydrJ4hODPjug9+L8+stY5HxN33s4/CgJU/4VbRWihiPbJ7ip4ILV8WJuA+R+bi0iU0WXOAlc+6UQqDiditK0j/0o+6CEO8WcIxB786gwxK/WnU/ORAL8dmn5T6BHQJGt33S/opX325xNtATjd4Ky8NW9XzeVSvXQKBgQCT8B5XxCBqN503OB2CImbyPnUbUbXbhG9JdfConb1NpvvqylwvEzaroQoI+axTMuKCJnfK4vbgtJdkJzY4MTSndp0i4OCEOSAWBxkxfyws0aiINhTKus4X9u2FbEJxeBqVFa8U3x2WF6ktF/SxR6/nVvzcjduUkpb6fmDHHYz/2QKBgQCl3UtSbBG+x6Kq/kCiGBYmATA68q9vKJQNa0h+I142jS+SuuB+8Lv0nWbI/f7ka48ZGQ9jFMzDZfPdoblpYEAAmN8GMh0X5mw841crfChWfiO/PNr1rDN8Gcwfl4b6+21+WPNBNC46YS1J25X0IWeAtWibe+Mv93xgNKkwoHpXlQKBgCSonmypEa/CzBn4ECLuNzlEB46/Qu7wEmcvtO22UvWRIgqEABswDB7g3LLJWBYZH8QXUZEgvh+Tt4uvGzuRkC543s4REJRhhIlYS2JTaP/9k6vKcuxszu8PXmpweeDAhTTPvnoE9ebQ/uOEtQxYs9Fr4E5Sl921yVPfdVQRDexa";
	
	
	//支付宝的公钥，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
	public static String alipay_public_key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAliQP6SsWc39ktSyfTVuG2dHQz9sXZDl4dehw1jDyzrHsarlLE8Ok4qnz+nyZyPVm94JfLr950alLrv/Bcc+I2Cf8ruxH3VHuo4YVF0EZK08XX/F5i58rEpGnkf06gO/gRpqb0T62/EULIxFaEwWCY6VD1NRgrMub6HJR8thAdDyZRSuVnWptk7puRW9W25MIm8gtqzeN8M/h91AF0/uGcwRiA45fCBaJKixOuqqivftuyZsgJMdAoPnEaxdNbGrA++qP2FRD4sodafuqZNgTJ4QomO7VVe+NpSSjnJOFxBSSEoUhXfoxwgVaiN0J4PZKsrqeqFxYPLQ3n84IfRTUJQIDAQAB";
	// 签名方式
	public static String sign_type = "RSA2";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static String log_path ="C://";
		
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";

	// 接收通知的接口名
	public static String service = "http://wx.techfit.cn/gym-web/weixin/pay/callbacks";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
}

