package com.capg.team2.goa.entity;
import java.util.*;


import javax.persistence.*;


import com.capg.team2.goa.entity.ProductEntity;

@Entity
@Table(name = "wishlist")
public class WishlistitemEntity 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishlistId;
	
	@Column(name = "userId")
	private  String userId;
	
	@Column(name = "productIds")
    private  List<String> productIds;


    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productIds", referencedColumnName = "wishlistId", insertable = false, updatable = false)
    private ProductEntity product;

    


    public WishlistitemEntity(String userId, List<String> wishlistId)
    {
        this.userId = userId;
        this.productIds=wishlistId;
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

    public void setId(int id) {
        this.wishlistId = wishlistId;
    }

    public void setProductId( List<String> productIds) {
        this.productIds = productIds;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public ProductEntity getProduct() {
        return product;
    }
}
