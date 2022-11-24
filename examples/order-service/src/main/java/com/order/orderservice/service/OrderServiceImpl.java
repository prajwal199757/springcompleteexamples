package com.order.orderservice.service;

import com.order.orderservice.entity.Order;
import com.order.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Integer saveOrder(Order order) {
        return orderRepository.save(order).getOrderId();
    }
}
