package com.yuanqi.otms.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: LoginController.java
 * @Package com.yuanqi.otms.controller
 * @Description: 进入登录页面的controller
 * @author 元启智能 李晓刚
 * @date 2015年7月9日 下午5:11:33
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
