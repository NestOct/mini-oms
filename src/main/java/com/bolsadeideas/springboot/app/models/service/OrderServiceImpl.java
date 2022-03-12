package com.bolsadeideas.springboot.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IOrderDao;
import com.bolsadeideas.springboot.app.models.entity.Order;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private IOrderDao orderDao;

	@Transactional
	@Override
	public Order saveOrder(Order order) {
		return orderDao.save(order);
	}

	@Transactional
	@Override
	public void deleteOrder(Long id) {
		orderDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Order orderById(Long id) {
		return orderDao.findById(id).orElse(null);
	}

}
