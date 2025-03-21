package com.springcloud.services;

import com.springcloud.model.OrderModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "02-order-service",url = "${ORDER_SERVICE_URI:http://localhost:8082}")
public interface OrderServiceFeignClient {
   @GetMapping("/v1/getOrderDetails/{cxId}")
    public List<OrderModel> callOrderDetailsByCustomerId(@PathVariable("cxId") Integer cxId);

}
