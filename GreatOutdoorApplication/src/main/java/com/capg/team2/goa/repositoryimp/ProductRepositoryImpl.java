package com.capg.team2.goa.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.ProductEntity;
public class ProductRepositoryImpl implements IProductRepository {
	@Autowired
	public IProductRepository ProductRepository;

	@Override
	public List<ProductEntity> findAllProducts() {
		// TODO Auto-generated method stub
			List<ProductEntity> allproduct = (List<ProductEntity>) ProductRepository.findAllProducts();
			return allproduct;
	}

	@Override
	public ProductEntity findByProductId(String id) {
		// TODO Auto-generated method stub
		ProductEntity findbyproduct=(ProductEntity) ProductRepository.findByProductCategory(id);
		return findbyproduct;
	}

	@Override
	public List<ProductEntity> findByProductCategory(String productCategory) {
		// TODO Auto-generated method stub
		List<ProductEntity> findbyproductcategory = (List<ProductEntity>) ProductRepository.findByProductCategory(productCategory);
		return findbyproductcategory;
	}

	@Override
	public ProductEntity addProduct(ProductEntity productEntity) throws ProductException {
		// TODO Auto-generated method stub
		ProductEntity addproduct = new ProductEntity();
		ProductRepository.addProduct(productEntity);
		return addproduct;
	}

	@Override
	public ProductEntity updateProduct(ProductEntity productEntity) throws ProductException {
		// TODO Auto-generated method stub
		ProductEntity updateProduct = new ProductEntity();
		ProductRepository.updateProduct(productEntity);
		return updateProduct;
	}

	@Override
	public void updateProductQuantity(Integer quantity, String productId) {
		// TODO Auto-generated method stub
		ProductRepository.updateProductQuantity(quantity, productId);
	}

	@Override
	public void deleteByProductId(String id) throws ProductException {
		// TODO Auto-generated method stub
		ProductRepository.deleteByProductId(id);
		
	}

	@Override
	public List<ProductEntity> search(String keyword) {
		// TODO Auto-generated method stub
		List<ProductEntity> search = (List<ProductEntity>) ProductRepository.search(keyword);
		return search;
	}

	@Override
	public List<ProductEntity> filter(double maxPrice) {
		// TODO Auto-generated method stub
		List<ProductEntity> filter =(List<ProductEntity>) ProductRepository.filter(maxPrice);
		return filter;
	}

}
