package com.capg.team2.goa.entity;
import java.util.*;


import javax.persistence.*;


import com.capg.team2.goa.entity.ProductEntity;

@Entity
public class WishlistitemEntity 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishlistId;
	@Column(name = "userId")
	private  String userId;
	@ElementCollection
    private  List<String> productIds;
    
    
    public WishlistitemEntity() {
		super();
	}

	

    public WishlistitemEntity(int wishlistId, String userId, List<String> productIds) {
		super();
		this.wishlistId = wishlistId;
		this.userId = userId;
		this.productIds = productIds;
	}



	public int getId() {
        return wishlistId;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public void setProductId( List<String> productIds) {
        this.productIds = productIds;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
