package com.lc.gmall.service;

import java.util.List;

import com.lc.gmall.bean.UserAddress;

/**
 * 用户服务
 * 
 * @author LC
 *
 */
public interface UserService {
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
