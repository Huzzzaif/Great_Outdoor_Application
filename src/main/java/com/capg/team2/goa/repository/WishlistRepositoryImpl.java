package com.capg.team2.goa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.WishlistitemEntity;

public class WishlistRepositoryImpl implements IWishlistRepository
{
  @Autowired
  public IWishlistRepository WishlistRepository;

@Override
public List<WishlistitemEntity> findAllItems() {
	// TODO Auto-generated method stub
	List<WishlistitemEntity> allItems = (List<WishlistitemEntity>) WishlistRepository.findAllItems();
	return allItems;
}

@Override
public WishlistitemEntity findWishlist(String userId) {
	// TODO Auto-generated method stub
	WishlistitemEntity wishlist = (WishlistitemEntity) WishlistRepository.findWishlist(userId);
	return wishlist;
}

@Override
public WishlistitemEntity findWishlistItem(String productId, String userId) {
	// TODO Auto-generated method stub
	WishlistitemEntity wishlistItem = (WishlistitemEntity) WishlistRepository.findWishlistItem(productId, userId);
	return wishlistItem;
}


@Override
public void addProductToWishlist(String prodId, List<String> wishlistID) {
	// TODO Auto-generated method stub
	WishlistitemEntity wishlist =new WishlistitemEntity(prodId,wishlistID);
	WishlistRepository.save(wishlist);
	
}

@Override
public void deleteWishlistItem(String productId, String userId) throws WishlistException {
	// TODO Auto-generated method stub
	WishlistRepository.deleteWishlistItem(productId, userId);
	
}

@Override
public void deleteWishlist(String userId) throws WishlistException {
	// TODO Auto-generated method stub
	WishlistRepository.deleteWishlist(userId);
}

@Override
public void  addWishlistItem(WishlistitemEntity wishlistItem) throws WishlistException {
	// TODO Auto-generated method stub
	WishlistitemEntity additem=new WishlistitemEntity(productIds,wishlistId);
	WishlistRepository.addProductToWishlist(productIds,wishlistId );
}

@Override
public void addProductToWishlist(String prodId, int wishlistID) {
	// TODO Auto-generated method stub
	
}
  
  
  
  

}
