package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.OrderLine;

public interface IOrderLineService {
	
	public void saveOrderLine(OrderLine orderLine);
	
	public void deleteOrderLine(Long id);

	public OrderLine orderLineById(Long id);
	
}
