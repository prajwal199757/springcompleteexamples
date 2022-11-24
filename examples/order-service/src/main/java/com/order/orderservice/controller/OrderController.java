package com.order.orderservice.controller;

import com.order.orderservice.entity.Order;
import com.order.orderservice.repository.OrderRepository;
import com.order.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public ResponseEntity<String> saveOrder1(@RequestBody Order order){
        Integer id = orderService.saveOrder(order);
        return  new ResponseEntity<String>("customer with  Id'"+id+"' has been saved", HttpStatus.OK);

    }





}
