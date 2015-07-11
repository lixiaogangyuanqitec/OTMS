package com.yuanqi.otms.controller.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yuanqi.otms.po.Operator;
import com.yuanqi.otms.po.OperatorCustom;
import com.yuanqi.otms.service.OperatorService;

/**
 * @Title: TOperatorController.java
 * @Package com.yuanqi.otms.controller
 * @Description: �û������controller
 * @author Ԫ������ ������
 * @date 2015��7��9�� ����11:07:31
 * @version V1.0
 */

@Controller
@RequestMapping("/operator")
public class OperatorController {
	@Autowired
	private OperatorService operatorService;
	
	@RequestMapping("/validateOperator")
	public ModelAndView  queryOperator(String username,String password) throws Exception {
		Operator operatorCustom =operatorService.getOperator(username);
		if(operatorCustom==null){
			return new ModelAndView("/login/login", "res","�û�������");
		}else{
			return new ModelAndView("/login/login", "res","�û�����ȷ");
		}
		
	}
}
