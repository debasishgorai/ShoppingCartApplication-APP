package com.debasish.ShoppingCartApplication.service;


import java.util.List;

import com.debasish.ShoppingCartApplication.model.*;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void updateQuantity(String sy, Integer cid);

}
