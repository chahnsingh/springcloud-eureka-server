package com.springcloud.controller;

import com.springcloud.services.OrderServiceFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/user")
@Slf4j
public class UserController {
    @Autowired
    private OrderServiceFeignClient orderServiceFeignClient;
    @GetMapping("getOrderDetails/{cxId}")
    public ResponseEntity<?> getOrderDetailsByCxId(@PathVariable("cxId") Integer cxId) {
        log.info("req -> getOrderDetails and parameter is : {}",cxId);
        return new ResponseEntity<>(orderServiceFeignClient.callOrderDetailsByCustomerId(cxId), HttpStatus.OK);
    }
}
