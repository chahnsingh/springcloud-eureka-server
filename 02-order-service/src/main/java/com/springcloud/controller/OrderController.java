package com.springcloud.controller;

import com.springcloud.services.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/")
@Slf4j
public class OrderController {
    private OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping("/getOrderDetails/{cxId}")
    public ResponseEntity<?> getOrdersByCustomerId(@PathVariable(name = "cxId") Integer cxId){
        return orderService.getOrdersByCustomerId(cxId);
    }
}
