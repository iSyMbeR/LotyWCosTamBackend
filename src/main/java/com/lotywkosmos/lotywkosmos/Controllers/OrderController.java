package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.Order;
import com.lotywkosmos.lotywkosmos.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }
    @GetMapping("/orders/{id}")
    public Order getSingleOrder(@PathVariable long id) {
        return orderService.getSinglePost(id);
    }

}
