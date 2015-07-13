package com.yuanqi.otms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yuanqi.otms.mapper.OperatorMapperCustom;
import com.yuanqi.otms.po.OperatorCustom;
import com.yuanqi.otms.po.OperatorVo;
import com.yuanqi.otms.service.OperatorService;

/**   
 * @Title: TOperatorServiceImpl.java 
 * @Package com.yuanqi.otms.service.impl 
 * @Description: �û�service�ӿڵ�ʵ���� 
 * @author Ԫ������   ������
 * @date 2015��7��9�� ����11:02:10 
 * @version V1.0   
 */
public class OperatorServiceImpl implements OperatorService{

	/* (non-Javadoc)
	 * @see com.yuanqi.otms.service.TOperatorService#findOperatorList(com.yuanqi.otms.po.TOperatorQueryVo)
	 */
	
	@Autowired
	private OperatorMapperCustom operatorMapperCustom;
	
	
	

	/* (non-Javadoc)
	 * @see com.yuanqi.otms.service.OperatorService#getOperator(java.lang.String, java.lang.String)
	 */
	@Override
	public OperatorCustom getOperator(String username)
			throws Exception {
		// TODO Auto-generated method stub
		OperatorCustom operatorcustom=new OperatorCustom();
		operatorcustom.setOid(username);
		OperatorVo operatorvo=new OperatorVo();
		operatorvo.setOperatorCustom(operatorcustom);
		return operatorMapperCustom.getOperator(operatorvo);
	}
	
	
	

}
