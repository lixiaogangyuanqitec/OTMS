package com.yuanqi.otms.controller.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String queryOperator(String username,String password) throws Exception {
		System.out.println("�û���������"+username+"++"+password);
		return "";
	}
}
