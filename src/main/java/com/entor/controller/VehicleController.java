package com.entor.controller;


import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Member;
import com.entor.entity.Result;
import com.entor.entity.Vehicle;
import com.entor.service.IVehicleService;
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
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private IVehicleService vehicleService;

	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String,Object> queryByPage(@RequestParam(name="currentPage",defaultValue="1")int currentPage,@RequestParam(name="currentPage",defaultValue="20")int PageSize) {
		System.out.println("接收到请求：queryByPage");
		PageHelper.startPage(currentPage,PageSize);
		List<Vehicle> list = vehicleService.list();
		PageInfo<Vehicle> info = new PageInfo<>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "ms");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}
	
	@RequestMapping("/deleteMore")
	@ResponseBody
	public Result deleteMore(@RequestParam(name="ids")Collection ids) {
		vehicleService.removeByIds(ids);
		Result r = new Result();
		r.setMsg("数据删除成功");
		r.setStatue(0);
		return r;	
	} 
	
	@RequestMapping("/add")
	public Result add(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return new Result(0,"数据添加成功");
	}
	
	@RequestMapping("/queryAll")
	public List<Vehicle> queryAll() {
		return vehicleService.list();
	}
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		//如果客户端传递yyyy-MM-dd格式的字符串，就当做java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}

