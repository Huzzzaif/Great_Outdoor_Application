package com.capg.team2.goa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;
import com.capg.team2.goa.entity.ProductEntity;
@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Integer>{
	List<ProductEntity> findAllProducts();

	ProductEntity findByProductId(String id);

	List<ProductEntity> findByProductCategory(String productCategory);

	ProductEntity addProduct(ProductEntity productEntity) throws ProductException;

	ProductEntity updateProduct(ProductEntity productEntity) throws ProductException;

	void updateProductQuantity(Integer quantity,String productId);

	void deleteByProductId(String id) throws ProductException;

	List<ProductEntity> search(String keyword);

	List<ProductEntity> filter(double maxPrice);

}
