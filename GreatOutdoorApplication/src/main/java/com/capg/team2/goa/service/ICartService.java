package com.capg.team2.goa.service;

import java.util.List;

import com.capg.team2.goa.entity.CartitemEntity;
import com.capg.team2.goa.exception.EmptyCartException;

public interface ICartService {
	
	public List<CartitemEntity> findCartlist(String userid) throws EmptyCartException;
	public CartitemEntity findCartitem(String productid, String userid) throws EmptyCartException;
	public CartitemEntity addCart(CartitemEntity cartitementity) ;
	public CartitemEntity updateCart(CartitemEntity cartitemEntity);
	public void deleteCartitem(int cartId , String productId) throws EmptyCartException;
	public void deleteCartlist(String userId) throws EmptyCartException;

}
