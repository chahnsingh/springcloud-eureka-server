package com.springcloud.services;

import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity<?> getOrdersByCustomerId(Integer customerId);
}
