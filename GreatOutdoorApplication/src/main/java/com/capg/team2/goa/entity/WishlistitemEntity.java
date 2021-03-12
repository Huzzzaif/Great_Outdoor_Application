package com.capg.team2.goa.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
public class WishlistitemEntity 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishlistId;
	@Column(nullable = false)
	private  String userId;
	@OneToMany(targetEntity = ProductEntity.class,cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
    private  List<ProductEntity> productIds;
    
    
    public WishlistitemEntity() {
		super();
	}

	

    public WishlistitemEntity(int wishlistId, String userId, List<ProductEntity> productIds) {
		super();
		this.wishlistId = wishlistId;
		this.userId = userId;
		this.productIds = productIds;
	}



	public int getId() {
        return wishlistId;
    }

    public List<ProductEntity> getProductIds() {
        return productIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public void setProductId( List<ProductEntity> productIds) {
        this.productIds = productIds;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
