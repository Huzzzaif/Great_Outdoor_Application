package com.capg.team2.goa.repository;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.OrderEntity;



@Repository
public interface IOrderRepository  {
	
		public List<OrderEntity> findOrdersByUserId(String userId);
		public List<OrderEntity> findAllOrders();
		public OrderEntity addOrder(OrderEntity orderEntity);
		public void deleteAllOrders();
		public void deleteOrderById(String orderId);
		public void updateDate(String orderId, LocalDate dispatchDate, LocalDate arrivalDate);
		

}
