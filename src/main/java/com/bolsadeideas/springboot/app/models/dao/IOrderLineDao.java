package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.OrderLine;

public interface IOrderLineDao extends CrudRepository<OrderLine, Long>{

}
