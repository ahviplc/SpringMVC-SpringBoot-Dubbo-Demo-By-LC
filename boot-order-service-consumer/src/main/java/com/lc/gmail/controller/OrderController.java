package com.lc.gmail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lc.gmall.bean.UserAddress;
import com.lc.gmall.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
    
	@ResponseBody
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
		return orderService.initOrder2AndReturnList(userId);
	}

}
