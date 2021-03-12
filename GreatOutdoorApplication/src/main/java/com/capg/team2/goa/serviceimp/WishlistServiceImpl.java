package com.capg.team2.goa.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.team2.goa.entity.WishlistitemEntity;
import com.capg.team2.goa.exception.WishlistException;
import com.capg.team2.goa.repository.ProductRepository;
import com.capg.team2.goa.repository.WishlistRepository;
import com.capg.team2.goa.service.IWishlistService;
import com.sprint1.movie.booking.Ticket.booking.entities.Screen;
import com.sprint1.movie.booking.Ticket.booking.exceptions.ScreenNotExistsException;

@Service
public class WishlistServiceImpl implements IWishlistService
{
	@Autowired
	WishlistRepository wishlistRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public List<WishlistitemEntity> findAllItems() 
	{
		List<WishlistitemEntity> wishlist = WishlistRepository.findAll();
		return wishlist;
	}


	public WishlistitemEntity findWishlist(String userId) 
	{
		// TODO Auto-generated method stub
		Optional<WishlistitemEntity> findRemoveWishlist=WishlistRepository.findByUserId(userId);
			if(findRemoveWishlist.isPresent())
				{
					return findRemoveWishlist.get();
				}
			else 
				{
			throw new WishListNotExistsException("Wishlist not exist with userId: "+ userId);
				}
	}

	@Override
	public WishlistitemEntity findWishlistItem(String productId, String userId) 
	{
		
		Optional<WishlistitemEntity> findRemoveWishlist=WishlistRepository.findByUserId(userId);
		if(findRemoveWishlist.isPresent())
			{
				return findRemoveWishlist.get();
			}
		else 
			{
		throw new WishListNotExistsException("Wishlist not exist with userId: "+ userId);
			}
	}

	@Override
	public void deleteWishlistItem(String productId, String userId) throws WishlistException 
	{
		wishlistRepository.delete();
	}

	@Override
	public void deleteWishlist(String userId) throws WishlistException 
	{
		Optional<WishlistitemEntity> findRemoveWishlist=wishlistRepository.findById(userId);
		if(findRemovewishlist.isPresent()) 
		{
			wishlistRepository.delete(findRemovewishlist.get());
		}
		else 
		{
			throw new ScreenNotExistsException("Wishlist not exist with userId: " +  userId);
		}
	}
		
	

	@Override
	public void addProductToWishlist(String prodId, List<String> wishlistID) 
	{
		Optional<WishlistitemEntity> getaddProduct=WishlistRepository.findById(WishlistitemEntity.getWishlistId());
		System.out.println(getUpdateScreen.get());
		WishlistEntity addProduct= new WishlistEntity();
		
		List<ProductEntity> products=new List<ProductEntity>();
		System.out.println(WishlistEntity.getShowList());
		
		if(getaddProduct.isPresent()) 
		{
			addProduct=getaddProduct.get();
			System.out.println(addProduct);
		}
		
		if(WishlistitemEntity.getColumns()!=0)
		{
			addProduct.setColumns(WishlistEntity.getColumns());
		}
		
		if(WishlistitemEntity.getRows()!=0)
		{
			addProduct.setRows(WishlistEntity.getRows());
		}
		
		
		else 
		{
			WishListNotExistsException("Wishlist not exist with userId: "+ userId);
		}
	}

}
