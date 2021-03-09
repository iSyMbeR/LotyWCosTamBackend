package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.Port;
import com.lotywkosmos.lotywkosmos.service.PortService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PortController {


    private final PortService portService;

    @GetMapping("/ports")
    public List<Port> getPorts(){
        return portService.getPorts();
    }

    @GetMapping("/ports/{id}")
    public Port getSinglePort(@PathVariable long id) {
        return portService.getSinglePort(id);
    }
}
