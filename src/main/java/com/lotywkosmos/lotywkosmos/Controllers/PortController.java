package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.Planet;
import com.lotywkosmos.lotywkosmos.Model.Port;
import com.lotywkosmos.lotywkosmos.Service.PlanetService;
import com.lotywkosmos.lotywkosmos.Service.PortService;
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
