package com.lotywkosmos.lotywkosmos.Service;


import com.lotywkosmos.lotywkosmos.Model.Order;
import com.lotywkosmos.lotywkosmos.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public Order getSinglePost(long id) {
        return orderRepository.findById(id)
                .orElseThrow();
    }

    public void addOrderToBase() {
        Order order = new Order();
        orderRepository.save(order);
    }
}
