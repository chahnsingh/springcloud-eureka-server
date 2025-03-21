package com.springcloud;

import com.springcloud.model.Order;
import com.springcloud.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order();
        order1.setName("Manoj");
        order1.setCustomerId(1);
        order1.setProduct("Cake");
        Order order2 = new Order();
        order2.setName("Kamlesh");
        order2.setCustomerId(1);
        order2.setProduct("Sweets");
        orderRepository.save(order1);
        orderRepository.save(order2);

    }
}
