package com.entor.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Member;
import com.entor.service.IMemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberService memberService;
	
	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="currentPage",defaultValue="1")int currentPage,@RequestParam(name="currentPage",defaultValue="20")int PageSize) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(currentPage,PageSize);
		List<Member> list = memberService.list();
		PageInfo<Member> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}
	
	@RequestMapping("/add")
	public Result add(Member member) {
		memberService.save(member);
		return null ;
		
	}
}

