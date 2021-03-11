package com.capg.team2.goa.serviceimp;

import java.util.List;

import com.capg.team2.goa.entity.CartitemEntity;
import com.capg.team2.goa.repository.ICartRepository;
import com.capg.team2.goa.service.ICartService;




public class ICartServiceImp implements ICartService {

	@Override
	public List<CartitemEntity> findCartlist(String userid) throws CartNotFound {
		// TODO Auto-generated method stub
		CartitemEntity c1 = new CartitemEntity;
		if(c1.getUserid()==userid)
		{
			
		}
		
	}

	@Override
	public CartitemEntity findCartitem(String productid, String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartitemEntity addcart(CartitemEntity cartitemEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartitemEntity updateCart(CartitemEntity cartitemEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCartitem(int cartid, String productid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCartlist(String userId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
