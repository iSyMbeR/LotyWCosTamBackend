package com.lotywkosmos.lotywkosmos.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String mainPage(){
        return "WITAM NA NAJBARDZIEJ ROZBUDOWANEJ STRONIE EVER, RAZEM Z DRUŻYNĄ LWKXD ZYCZYMY WSZYSTKIEGO DOBREGO\n" +
                "available endpoints:" +
                "\n/users, /users/{id}"+
                "\n/orders, /orders/{id}";
    }
}
