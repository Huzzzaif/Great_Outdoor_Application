package com.capg.team2.goa.repositoryimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.CartitemEntity;
import com.capg.team2.goa.repository.CartRepository;
import com.capg.team2.goa.repository.ICartRepository;

@Repository
public class CartRepositoryImp {
	
	@Autowired
	ICartRepository icartrep;
	
	@Autowired
	CartRepository cartrep;

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
