package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.OrderItem;
import com.lotywkosmos.lotywkosmos.Model.Port;
import com.lotywkosmos.lotywkosmos.Service.OrderItemService;
import com.lotywkosmos.lotywkosmos.Service.PortService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderItemController {


    private final OrderItemService orderItemService;

    @GetMapping("/orderItems")
    public List<OrderItem> getOrderItems(){
        return orderItemService.getOrderItems();
    }

    @GetMapping("/orderItems/{id}")
    public OrderItem getSingleOrderItem(@PathVariable long id) {
        return orderItemService.getSingleOrderItem(id);
    }
}
