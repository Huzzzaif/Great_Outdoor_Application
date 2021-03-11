package com.capg.team2.goa.service;
import java.util.*;

import com.capg.team2.goa.entity.WishlistitemEntity;
public interface IWishlistService 
{
	
	 List<WishlistitemEntity> findAllItems();
	
	 WishlistEntity findWishlist(String userId);
	
	 WishlistitemEntity findWishlistItem(String productId, String userId);
	
	 void deleteWishlistItem(String productId, String userId);
	
	 void deleteWishlist(String userId);
	
	 void addProductToWishlist(String productId, long wishlistId);
	
	
	
}
