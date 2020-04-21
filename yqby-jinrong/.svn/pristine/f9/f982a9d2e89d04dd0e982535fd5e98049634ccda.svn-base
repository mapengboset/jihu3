package com.yqbing.servicebing.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class JsonResult {
	
	/**
	 * json状态码，处理成功
	 */
	public static final int JSON_STATUS_SUCCESS = 200;
	
	/**
	 * json状态码，未登录
	 */
	public static final int JSON_STATUS_UNLOGIN = 301;
	
	/**
	 * 无权限
	 */
	public static final int JSON_STATUS_AUTHERROR = 302;
	
	/**
	 *重复数据 
	 */
	public static final int JSON_STATUS_REPEAT = 303;
	
	/**
	 * 服务器端错误
	 */
	public static final int JSON_STATUS_SERVERERROR = 500;
	
	
	/**
	 * 客户端问题
	 */
	public static final int JSON_STATUS_CLIENTERROR = 400;
	
	
	/**
	 * 内容不合法
	 */
	public static final int JSON_STATUS_CONTENT_ILLEGAL = 401;
	
	/**
	 * 支付业务逻辑代码 900800~900900  
	 * 余额不足
	 */
	public static final int JSON_PAY_NOTENOUGH = 900804;
	/**
	 * 支付业务逻辑代码 900800~900900  
	 * 余额足够
	 */
	public static final int JSON_PAY_ENOUGH =900800;
	
	/**
	 * 业务逻辑错误
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_BUSINESSERROR = 900000;
	
	
	/**
	 * 业务逻辑状态:数据已经存在
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_DUPLICATE = 900001;
	
	
	/**
	 * 业务逻辑状态:数据不存在
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_NOT_EXIST = 900002;
	
	
	/**
	 * 业务逻辑状态:数据不可为空
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_EMPTY = 900003;
	
	
	/**
	 * 业务逻辑状态:有外键关联
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_FOREIGN_KEY = 900004;
	
	
	/**
	 * 业务逻辑状态:申请加入班级时已经加入了其他班级
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_ANOTHER_CLASS = 900005;
	
	/**
	 * 业务逻辑状态:密码不正确
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_PWD_ERROR = 900006;
	
	/**
	 * 业务逻辑状态:不能解析的url
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_NOT_ANALYSIS = 900007;
	
	/**
	 * 业务逻辑状态:url为三人行内部网址
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_SRX_URL = 900008;
	
	/**
	 * 业务逻辑状态:认证条件未满足
	 */
	public static final int JSON_STATUS_NOT_APPROVE = 900009;

	/**
	 * 业务逻辑状态:投票已经结束
	 */
	public static final int JSON_STATUS_VOTE_END = 900010;

	/**
	 * 业务逻辑状态:投票选项超出设置的最多选项
	 */
	public static final int JSON_STATUS_OVER_MAXOPTIONS = 900011;
	
	/**
	 * 获取验证码过于频繁
	 */
	public static final int JSON_STATUS_CODE_MUCH = 900012;
	
	/**
	 * 验证手不存在于数据库的常量
	 */
	public static final int JSON_STATUS_MOBILE_NOTEXIST = 900013;
	
	/**
	 * 用户注册但未激活
	 */
	public static final int JSON_STATUS_USER_NOACTIVE = 900014;
	
	/**
	 * 其他自定义业务逻辑状态取值范围为900001~999999
	 */
	public static final int JSON_STATUS_NOT_SRX_ORG_URL = 900015;
	/**
	 * 业务逻辑状态:IP重复
	 */
	public static final int JSON_STATUS_IP_DUPLICATE = 900016;

	/**
	 * 状态码900100 ~ 900200 预留做文件类型相关状态
	 */
	public static final int JSON_STATUS_FILE_MAXSIZE_LARGE = 900100; 
	
	/**
	 * 文件类型限制
	 */
	public static final int JSON_STATUS_FILE_TYPE_LIMIT = 900101; 
	/**
	 * 查询出的必要信息不完整
	 */
	public static final int JSON_STATUS_INCOMPLATE = 900206;
	/**
	 * 输入信息与真实信息不符
	 */
	public static final int JSON_STATUS_MISMATCH = 900207;
	/**
	 * 学生已加入其他班级
	 */
	public static final int JSON_STATUS_NOTIN_CLASS = 900208;
	/**
	 * 未加入任何班级
	 */
	public static final int JSON_STATUS_NO_CLASS = 900209;
	/**
	 * 手机号码格式不正确
	 */
	public static final int JSON_STATUS_MOBILE_FORM_ERROR = 900210;
	

	/**
	 * 添加个数超出限制范围
	 */
	public static final int JSON_STATUS_COUNT_OUT = 900211;
	/**
	 * 验证码错误
	 */
	public static final int JSON_STATUS_VALIDATE_ERROR = 900212;
	/**
	 * 账号不存在
	 */
	public static final int JSON_STATUS_NOUSER = 900213;
	/**
	 *不能退出班级
	 */
	public static final int JSON_STATUS_NOEXIT = 900214;
	/**
	 * 账号重复使用（孩子和家长不能使用同一账号建立关联）
	 */
	public static final int JSON_STATUS_ACCOUNTREPEAT = 900215;
	/**
	 * 学校中班级个数不能小于1
	 */
	public static final int JSON_STATUS_LESS_LIMIT = 900216;
	
	/**
	 * 手机号已注册
	 */
	public static final int JSON_STATUS_MOBILE_EXIST = 900217;
	
	/**
	 * 邮箱已注册
	 */
	public static final int JSON_STATUS_EMAIL_EXIST = 900218;
	
	/**
	 * 昵称已存在
	 */
	public static final int JSON_STATUS_NICKNAME_EXIST = 900219;
	
	/**
	 * 访问IP受限
	 */
	public static final int JSON_STATUS_IP_ERROR = 900220;
	
	/**
	 * 认证用户不能修改真实姓名
	 */
	public static final int JSON_STATUS_VERIFY = 900221;

	/**
	 * 发帖频率过快
	 */
	public static final int JSON_STATUS_POST_FAST=900222;
	
	/**
	 * 内容超长
	 */
	public static final int JSON_CONTETN_LONG = 900223;
	
	
	/**
	 * 预留900300-900400关注业务逻辑状态码
	 */
	public static final int JSON_STATUS_FOLLOWS_OVERFLOW=900300;
	
	/**
	 * 角色冲突（老师或家长不能作为孩子被关联）
	 */
	public static final int JSON_STATUS_PARENT_LIMIT = 900301;
	
	/**
	 * 角色冲突 (孩子不能作为老师或家长创建班级，关联学生)
	 */
	public static final int JSON_STATUS_CHILD_LIMIT = 900302;
	
	/**
	 * 空间不足（班级百宝箱）
	 */
	public static final int JSON_STATUS_SPACE_NOTENOUGH = 900303;
	/**
	 * 扩充空间超出限制
	 */
	public static final int JSON_STATUS_SPACE_LIMIT = 900304;
	
	/**
	 * 家长和孩子未建立关联
	 */
	public static final int JSON_STATUS_NO_UURELATION = 900305;
	
	/**
	 * 创建数量超出限制
	 */
	public static final int JSON_STATUS_CREATE_NUM_LIMIT = 900306;
	/**
	 * 班级成员数超出限制
	 */
	public static final int JSON_STATUS_MEMBER_NUM_LIMIT = 900307;
	/**
	 * 
	 * @param response
	 * @param s    [必选]状态：200 代表成功，其他代表错误代码
	 * -1 ： 未登陆
	 * -2 ： 权限不足
	 * -3 ：重复数据
	 * -4xx ：客户端问题，比如
	 * -404 ： 请求内容不存在。
	 * -5xx ：服务端问题，比如
	 * -500 ：未知错误。
	 * @param data [可选] 返回的数据，data 可以是[json对象|数组|字符串|数字等任何合法类型]。
	 * @param msg  [可选][字符串]。消息字段
	 * @throws IOException
	 */
	public static void write(HttpServletResponse response, int s, Object data, String msg){
		JSONObject result = new JSONObject();
		result.put("s", s);
		if(data!=null){
			result.put("data", data);
		}
		result.put("msg", msg);
		response.setContentType("text/html;charset=UTF-8"); 
		try {
			response.getWriter().write(result.toString());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("error occured when write json result! data="+data);
		}
	}
	/**
	 * 针对图片提交的时候，最外层嵌套div，解决IE下不能解析json字符串问题 --- cackIE
	 * @param response
	 * @param s
	 * @param data
	 * @param msg
	 */
	public static void writeForPic(HttpServletResponse response, int s, Object data, String msg){
		JSONObject result = new JSONObject();
		result.put("s", s);
		if(data!=null){
			result.put("data", data.toString());
		}
		result.put("msg", msg);
		response.setContentType("text/html;charset=UTF-8"); 
		try {
			response.getWriter().write("<div>"+result.toString()+"</div>");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("error occured when write json result! data="+data);
		}
	}
	
	
	public static void writeForPicWithDomain(HttpServletResponse response, int s, Object data, String msg){
		JSONObject result = new JSONObject();
		result.put("s", s);
		if(data!=null){
			result.put("data", data);
		}
		result.put("msg", msg);
		response.setContentType("text/html;charset=UTF-8"); 
		try {
			response.getWriter().write("<html><head><script>document.domain=\"3ren.cn\"</script></head><body>"+result.toString()+"</body></html>");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("error occured when write json result! data="+data);
		}
	}
	
	/**
	 * 
	 * @param response
	 * @param s    [必选]状态：200 代表成功，其他代表错误代码
	 * -1 ： 未登陆
	 * -2 ： 权限不足
	 * -3 ：重复数据
	 * -4xx ：客户端问题，比如
	 * -404 ： 请求内容不存在。
	 * -5xx ：服务端问题，比如
	 * -500 ：未知错误。
	 * @param data [可选] 返回的数据，data 可以是[json对象|数组|字符串|数字等任何合法类型]。
	 * @param msg  [可选][字符串]。消息字段
	 * @throws IOException
	 */
	public static void writeCallback(HttpServletResponse response, int s, Object data, String msg, String callback){
		JSONObject result = new JSONObject();
		result.put("s", s);
		if(data!=null){
			result.put("data", data);
		}
		result.put("msg", msg);
		response.setContentType("text/html;charset=UTF-8"); 
		try {
			response.getWriter().write("try{"+callback+"("+result.toString()+")}catch(e){}");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("error occured when write json result! data="+data);
		}
	}
}
