package com.capg.team2.goa.service;

import java.util.List;

import com.capg.team2.goa.entity.CartitemEntity;

public interface ICartService {
	
	public List<CartitemEntity> findCartlist(String userid);
	public CartitemEntity findCartitem(String productid, String userid);
	public CartitemEntity addCart(CartitemEntity cartitementity);
	public CartitemEntity updateCart(CartitemEntity cartitemEntity);
	public void deleteCartitem(int cartId , String productId);
	public void deleteCartlist(String userId);

}
