package com.jt.dubbo.service;

import com.jt.dubbo.pojo.Order;

public interface OrderService {

	String saveOrder(Order order);
	//根据订单id查询数据
	Order findOrderById(String orderId);
}
