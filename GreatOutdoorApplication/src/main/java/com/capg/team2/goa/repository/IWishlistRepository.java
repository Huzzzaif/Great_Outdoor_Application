package com.capg.team2.goa.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.WishlistitemEntity;


@Repository
public interface IWishlistRepository{
	List<WishlistitemEntity> findAllItems();

	WishlistitemEntity findWishlist(String userId);

	WishlistitemEntity findWishlistItem(String productId, String userId);
	void addProductToWishlist(String prodId,int wishlistID);
	void deleteWishlistItem(String productId, String userId) throws WishlistException;

	void deleteWishlist(String userId) throws WishlistException;

	void addWishlistItem(WishlistitemEntity wishlistItem) throws WishlistException;

	void addProductToWishlist(String prodId, List<String> wishlistID);

}
