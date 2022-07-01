package com.exampe.demo.app.inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping
	public String Index() {
		return "layout/common";
	}
}
