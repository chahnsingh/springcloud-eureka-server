package com.springcloud.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderModel {
    private Long id;
    private Integer customerId;
    private String name;
    private String product;
}
