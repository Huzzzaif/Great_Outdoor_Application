package com.capg.team2.goa.service;




import java.util.List;

import com.capg.team2.goa.entity.ProductEntity;

public interface IProductService
{
	public List<ProductEntity> findAllProducts();

	public ProductEntity findByProductId(String id);

 	public List<ProductEntity> findByProductCategory(String productCategory);

	public ProductEntity addProduct(ProductEntity productEntity) throws ProductException;

	public ProductEntity updateProduct(ProductEntity productEntity) throws ProductException;

	public void updateProductQuantity(Integer quantity,String productId);

	public void deleteByProductId(String id) throws ProductException;

	public List<ProductEntity> search(String keyword);

	public List<ProductEntity> filter(double maxPrice);

}
