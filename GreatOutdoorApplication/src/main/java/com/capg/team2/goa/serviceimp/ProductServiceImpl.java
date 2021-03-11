package com.capg.team2.goa.service;

import com.capg.team2.goa.entity.ProductEntity;
import com.capg.team2.goa.exception.ProductException;
import com.capg.team2.goa.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{
	
		@Autowired
		private IProductRepository productRepository;

		@Override
		public List<ProductEntity> findAllProducts() {
			// TODO Auto-generated method stub
			List<ProductEntity> findall =(List<ProductEntity>) productRepository.findAll();
			return findall ;
	
		}

		@Override
		public ProductEntity findByProductId(String id) {
			// TODO Auto-generated method stub
			ProductEntity findbyproduct=(ProductEntity) productRepository.findByProductCategory(id);
			return findbyproduct;

		}

		@Override
		public List<ProductEntity> findByProductCategory(String productCategory) {
			// TODO Auto-generated method stub
			List<ProductEntity> findbyProduct =(List<ProductEntity>) productRepository.findByProductCategory(productCategory);
			return findbyProduct ;
			
		}

		@Override
		public ProductEntity addProduct(ProductEntity productEntity) throws ProductException {
				// TODO Auto-generated method stub
			ProductEntity addproduct = new ProductEntity();
			productRepository.addProduct(productEntity);
			return addproduct;
			}

		@Override
		public ProductEntity updateProduct(ProductEntity productEntity) throws ProductException {
			// TODO Auto-generated method stub
			ProductEntity updateproduct = new ProductEntity();
			productRepository.updateProduct(productEntity);
			return updateproduct;
		}

		@Override
		public void updateProductQuantity(Integer quantity, String productId) {
			// TODO Auto-generated method stub
			productRepository.updateProductQuantity(quantity, productId);
			
		}

		@Override
		public void deleteByProductId(String id) throws ProductException {
			// TODO Auto-generated method stub
			productRepository.deleteByProductId(id);
			
		}

		@Override
		public List<ProductEntity> search(String keyword) {
			// TODO Auto-generated method stub
			List<ProductEntity> search= (List<ProductEntity>) productRepository.search(keyword);
			return search;
		}

		@Override
		public List<ProductEntity> filter(double maxPrice) {
			// TODO Auto-generated method stub
			List<ProductEntity> filter=(List<ProductEntity>) productRepository.filter(maxPrice);
			return filter;
		}
		
		
	

}
