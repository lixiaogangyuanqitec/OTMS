package com.yuanqi.otms.service;

import com.yuanqi.otms.po.OperatorCustom;

/**   
 * @Title: TOperatorService.java 
 * @Package com.yuanqi.otms.service.impl 
 * @Description: �û�service�ӿ� 
 * @author Ԫ������   ������
 * @date 2015��7��9�� ����10:57:47 
 * @version V1.0   
 */
public interface OperatorService {
		//���û�����ѯ�û���Ϣ
		public OperatorCustom getOperator(String username)
				throws Exception;
}
