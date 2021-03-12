package com.capg.team2.goa.service;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.team2.goa.entity.WishlistitemEntity;
import com.capg.team2.goa.exception.WishlistException;


@Service
public interface IWishlistService {
	List<WishlistitemEntity> findAllItems();

	WishlistitemEntity findWishlist(String userId);

	WishlistitemEntity findWishlistItem(String productId, String userId);
	void addProductToWishlist(String prodId,int wishlistID);
	void deleteWishlistItem(String productId, String userId) throws WishlistException;

	void deleteWishlist(String userId) throws WishlistException;

	void addWishlistItem(WishlistitemEntity wishlistItem) throws WishlistException;

	void addProductToWishlist(String prodId, List<String> wishlistID);

}