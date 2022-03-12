package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Order;

public interface IOrderService {
	
	public Order saveOrder(Order order);
	
	public void deleteOrder(Long id);
	
	public Order orderById(Long id);

}
