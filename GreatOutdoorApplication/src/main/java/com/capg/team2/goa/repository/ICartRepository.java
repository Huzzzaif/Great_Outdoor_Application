package com.capg.team2.goa.repository;

import java.util.List;

import com.capg.team2.goa.entity.CartitemEntity;

public interface ICartRepository {

	
	public List<CartitemEntity> findCartlist(String userid);
	public CartitemEntity findCartitem(String productid, String userid);
	public CartitemEntity addCart(CartitemEntity cartitementity);
	public CartitemEntity updateCart(CartitemEntity cartitemEntity);
	public void deleteCartitem(int cartId , String productId);
	public void deleteCartlist(String userId);
}


