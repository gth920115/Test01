package com.jt.dubbo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.jt.dubbo.pojo.Cart;

public interface CartService {

	 List<Cart> findCartByUserId(Long userId);
	
	void saveCart(Cart cart);
	
	void updateCartNum(Long userId, Long itemId, Integer num);
	
	void deleteCart( Long itemId,Long userId);
}
