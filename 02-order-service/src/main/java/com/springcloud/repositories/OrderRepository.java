package com.springcloud.repositories;

import com.springcloud.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findAllByCustomerId(Integer customerId);

}
