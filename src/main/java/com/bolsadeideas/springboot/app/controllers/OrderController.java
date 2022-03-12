package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Order;
import com.bolsadeideas.springboot.app.models.service.IOrderService;

@RestController
@RequestMapping("/oms-nestor")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@PostMapping
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteOrder(@PathVariable(value="id") Long id) {
		try {
			
			if(id>0) {
				orderService.deleteOrder(id);
				return "Se elimino la orden: " + id;
			}
			
		} catch (NumberFormatException e) {
			return "Id invalido: " + e.getMessage();
		}
		return ":)";
	}

}
