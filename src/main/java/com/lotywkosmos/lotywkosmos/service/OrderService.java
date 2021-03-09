package com.lotywkosmos.lotywkosmos.service;


import com.lotywkosmos.lotywkosmos.model.Order;
import com.lotywkosmos.lotywkosmos.repository.OrderRepository;
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

    public void addOrderToBase(Order order) {
        orderRepository.save(order);
    }
}
