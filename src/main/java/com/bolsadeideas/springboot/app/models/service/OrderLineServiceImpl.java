package com.bolsadeideas.springboot.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IOrderLineDao;
import com.bolsadeideas.springboot.app.models.entity.OrderLine;

@Service
public class OrderLineServiceImpl implements IOrderLineService {

	@Autowired
	private IOrderLineDao orderLineDao;
	
	@Transactional
	@Override
	public void saveOrderLine(OrderLine orderLine) {
		orderLineDao.save(orderLine);
	}

	@Transactional
	@Override
	public void deleteOrderLine(Long id) {
		orderLineDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public OrderLine orderLineById(Long id) {
		return orderLineDao.findById(id).orElse(null);
	}

}
