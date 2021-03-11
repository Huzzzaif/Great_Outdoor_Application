package com.capg.team2.goa.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.CartitemEntity;
import com.capg.team2.goa.repository.ICartRepository;

public class ICartServiceImp {
	
	@Autowired
	ICartRepository icartrep;

	public List<CartitemEntity> findCartlist(String userid) {
		return icartrep.findCartlist(userid);
	}

	public CartitemEntity findCartitem(String productid, String userid) {
		return icartrep.findCartitem(productid, userid);
	}

	public CartitemEntity addCart(CartitemEntity cartitementity) {
		return icartrep.addCart(cartitementity);
	}

	public CartitemEntity updateCart(CartitemEntity cartitemEntity) {
		return icartrep.updateCart(cartitemEntity);
	}

	public void deleteCartitem(int cartId, String productId) {
		icartrep.deleteCartitem(cartId, productId);
	}

	public void deleteCartlist(String userId) {
		icartrep.deleteCartlist(userId);
	}
	
	

}
