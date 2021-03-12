package com.capg.team2.goa.repositoryimp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.CartitemEntity;
import com.capg.team2.goa.repository.CartRepository;
import com.capg.team2.goa.repository.ICartRepository;

public class ICartRepositoryImp implements ICartRepository {

	@Autowired
	CartRepository cartrepository;
	
	@Override
	public List<CartitemEntity> findCartlist(String userid) {
		Optional<CartitemEntity> cartlist = cartrepository.findById(userid);
		return cartlist.stream().collect(Collectors.toList());
 	}

	@Override
	public CartitemEntity findCartitem(String productid, String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartitemEntity addCart(CartitemEntity cartitementity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartitemEntity updateCart(CartitemEntity cartitemEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCartitem(int cartId, String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCartlist(String userId) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
