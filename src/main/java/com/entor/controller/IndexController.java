package com.entor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
@Controller
public class IndexController {

	@RequestMapping("/member.html")
	public ModelAndView member() {
		return new ModelAndView("member");
	}
	
	@RequestMapping("/ordinary.html")
	public ModelAndView ordinary() {
		return new ModelAndView("ordinary");
	}
	
	@RequestMapping("/vehicle.html")
	public ModelAndView vehicle() {
		return new ModelAndView("vehicle");
	}
	@RequestMapping("/lindex")
	public String index() {
		return "/lindex";
	}
	
}

