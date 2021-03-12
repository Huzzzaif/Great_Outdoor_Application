package com.capg.team2.goa.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.capg.team2.goa.entity.WishlistitemEntity;
import com.capg.team2.goa.exception.WishlistNotExistsException;


@Component
public interface IWishlistService {
	public List<WishlistitemEntity> findAllItems();

	public WishlistitemEntity findWishlist(String userId);

	public WishlistitemEntity findWishlistItem(String productId, String userId);
	
	public void deleteWishlistItem(String productId, String userId) throws WishlistNotExistsException;

	public void deleteWishlist(String userId) throws WishlistNotExistsException;

	public void addProductToWishlist(String prodId, List<String> wishlistID);

}