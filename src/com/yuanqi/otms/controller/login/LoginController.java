package com.yuanqi.otms.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: LoginController.java
 * @Package com.yuanqi.otms.controller
 * @Description: �����¼ҳ���controller
 * @author Ԫ������ ������
 * @date 2015��7��9�� ����5:11:33
 * @version V1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/toLoginPage")
	public String toLoginPage() {
		return "/login/login";
	}
}
