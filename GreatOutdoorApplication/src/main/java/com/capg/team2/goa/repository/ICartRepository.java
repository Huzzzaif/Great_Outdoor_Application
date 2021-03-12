package com.capg.team2.goa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.CartitemEntity;

//Cart repository
@Repository
public interface ICartRepository {

	//Find cart list of item based on userid
	@Query("from cart WHERE userid = ?1")
	public List<CartitemEntity> findCartlist(String userid);
	//Find the product present inside cart based on userid and productid
	@Query("SELECT cart from cart c, cartitem_entity_products cep WHERE c.userid = ?2 AND cep.product_key = ?1 AND c.cart_id = cep.cartitem_entity_cart_id")
	public CartitemEntity findCartitem(String productid, String userid);
	//
	public CartitemEntity addCart(CartitemEntity cartitementity);
	public CartitemEntity updateCart(CartitemEntity cartitemEntity);
	public void deleteCartitem(int cartId , String productId);
	public void deleteCartlist(String userId);
}


