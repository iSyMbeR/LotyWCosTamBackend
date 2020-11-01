package com.lotywkosmos.lotywkosmos.Service;

import com.lotywkosmos.lotywkosmos.Model.OrderItem;
import com.lotywkosmos.lotywkosmos.Repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;//injection

    public List<OrderItem> getOrderItems(){
        return orderItemRepository.findAll();
    }

    public OrderItem getSingleOrderItem(long id) {
        return orderItemRepository.findById(id)
                .orElseThrow();
    }

    public void addOrderItemToBase(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }
}
