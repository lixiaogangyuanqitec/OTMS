package com.yuanqi.otms.service;

import com.yuanqi.otms.po.OperatorCustom;

/**   
 * @Title: TOperatorService.java 
 * @Package com.yuanqi.otms.service.impl 
 * @Description: 用户service接口 
 * @author 元启智能   李晓刚
 * @date 2015年7月9日 上午10:57:47 
 * @version V1.0   
 */
public interface OperatorService {
		//按用户名查询用户信息
		public OperatorCustom getOperator(String username)
				throws Exception;
}
