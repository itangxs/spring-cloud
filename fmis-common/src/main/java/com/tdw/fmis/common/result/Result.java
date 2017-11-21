/*
 * 文件名 Result.java
 * 版权 Copyright 2017 团贷网
 * 创建人 谭荣巧
 * 创建时间 2017年11月20日 下午3:40:50 
 */
package com.tdw.fmis.common.result;

/**
 * Rest接口请求结果对象<br>
 * 
 * @author 谭荣巧
 * @date 2017年11月20日 下午3:40:50
 * @since fmis-common 1.0-SNAPSHOT
 */
public class Result {
	/**
	 * 错误代码
	 */
	private String code;
	/**
	 * 错误描述
	 */
	private String msg;
	/**
	 * 传递给请求者的数据
	 */
	private Object data;

	public Result() {
		super();
	}

	/**
	 * 构造请求成功的结果对象<br>
	 * 
	 * @author 谭荣巧
	 * @date 2017年11月20日 下午3:47:10
	 * @return 请求的结果对象
	 * @since fmis-common 1.0-SNAPSHOT
	 */
	public static Result success() {
		Result result = new Result();
		result.setCode("1");
		result.setMsg("请求成功！");
		return result;
	}

	/**
	 * 构造请求成功的结果对象<br>
	 * 
	 * @author 谭荣巧
	 * @date 2017年11月20日 下午3:47:36
	 * @param data
	 *            返回的数据集
	 * @return 请求的结果对象
	 * @since fmis-common 1.0-SNAPSHOT
	 */
	public static Result success(Object data) {
		Result result = new Result();
		result.setCode("1");
		result.setMsg("请求成功！");
		result.setData(data);
		return result;
	}

	/**
	 * 构造请求失败的结果对象<br>
	 * 
	 * @author 谭荣巧
	 * @date 2017年11月20日 下午3:48:01
	 * @param code
	 *            结果代码
	 * @param msg
	 *            结果描述
	 * @return 请求的结果对象
	 * @since fmis-common 1.0-SNAPSHOT
	 */
	public static Result error(String code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}

	/**
	 * 构造结果对象<br>
	 * 
	 * @author 谭荣巧
	 * @date 2017年11月20日 下午3:48:01
	 * @param code
	 *            结果代码
	 * @param msg
	 *            结果描述
	 * @param data
	 *            返回的数据集
	 * @return 请求的结果对象
	 * @since fmis-common 1.0-SNAPSHOT
	 */
	public static Result build(String code, String msg, Object data) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		return result;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
