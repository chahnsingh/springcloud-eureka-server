package com.springcloud.services.Impl;


import com.springcloud.model.Order;
import com.springcloud.repositories.OrderRepository;
import com.springcloud.services.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public ResponseEntity<?> getOrdersByCustomerId(Integer customerId) {
        try{
           List<Order> list = orderRepository.findAllByCustomerId(customerId);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e){
            log.error("exception occur in the method of : {}",e.getMessage());
        }
        return null;
    }
}
