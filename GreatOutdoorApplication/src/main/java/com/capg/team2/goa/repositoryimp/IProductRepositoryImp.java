package com.capg.team2.goa.repositoryimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.ProductEntity;
import com.capg.team2.goa.exception.ProductException;
import com.capg.team2.goa.repository.IProductRepository;
import com.capg.team2.goa.repository.ProductRepository;

public class IProductRepositoryImp implements IProductRepository {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductEntity> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity findByProductId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> findByProductCategory(String productCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity addProduct(ProductEntity productEntity) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity updateProduct(ProductEntity productEntity) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductQuantity(Integer quantity, String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByProductId(String id) throws ProductException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductEntity> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> filter(double maxPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
