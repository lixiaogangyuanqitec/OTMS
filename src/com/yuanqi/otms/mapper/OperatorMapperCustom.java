package com.yuanqi.otms.mapper;


import com.yuanqi.otms.po.OperatorCustom;
import com.yuanqi.otms.po.OperatorVo;

/**
 * 
* @Title: TOperatorMapperCustom.java 
* @Package com.yuanqi.otms.mapper 
* @Description: 用户自定义mapper
* @author 元启智能   李晓刚
* @date 2015年7月9日 上午10:36:50 
* @version V1.0
 */
public interface OperatorMapperCustom {
	//按用户名查询用户信息
	public OperatorCustom getOperator(OperatorVo operatorvo)
			throws Exception;
	
}
