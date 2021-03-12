package com.capg.team2.goa.repositoryimp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.OrderEntity;
import com.capg.team2.goa.repository.IOrderRepository;
import com.capg.team2.goa.repository.OrderRepository;

public class IOrderRepositoryImp implements IOrderRepository {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<OrderEntity> findOrdersByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderEntity> findAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity addOrder(OrderEntity orderEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderById(String orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDate(String orderId, LocalDate dispatchDate, LocalDate arrivalDate) {
		// TODO Auto-generated method stub
		
	}

}
