package com.lotywkosmos.lotywkosmos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home(){
        return "elo co tu robisz mała";
    }
}
