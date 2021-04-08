package com.lotywkosmos.lotywkosmos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String mainPage(){
        return "WITAM NA NAJBARDZIEJ ROZBUDOWANEJ STRONIE EVER, RAZEM Z DRUŻYNĄ LWKXD ZYCZYMY WSZYSTKIEGO DOBREGO\n" +
                "available endpoints:" +
                "\n/users, /users/{id}"+
                "\n/orders, /orders/{id}" +
                "\n/orderItems, /orderItems/{id}" +
                "\n/flights, /flights/{id}" +
                "\n/planets, /planets/{id}" +
                "\n/ports, /ports/{id}" +
                "\n/portLinks, /portLinks/{id}" +
                "\n/tickets, /tickets/user/id, /tickets/flight/id, /tickets/user/id/count,/ tickets/flight/id/count";
    }
}
