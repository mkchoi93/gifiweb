package com.gifi.webtest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		// /home.jsp�t�@�C���}�b�s���O
		return "home";
	}
}
