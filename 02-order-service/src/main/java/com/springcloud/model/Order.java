package com.springcloud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer customerId;
    private String name;
    private String product;
    public Order() {}




}
