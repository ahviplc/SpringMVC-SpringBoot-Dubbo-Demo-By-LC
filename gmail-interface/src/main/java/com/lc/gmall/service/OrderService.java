package com.lc.gmall.service;

import java.util.List;

import com.lc.gmall.bean.UserAddress;

public interface OrderService {

	/**
	 * 初始化订单方法
	 * @param userId
	 */
	public void initOrder(String userId);

	/**
	 *  初始化订单方法  返回list版本
	 * @param userId
	 * @return
	 */
	public List<UserAddress> initOrder2AndReturnList(String userId);

	
	
}
