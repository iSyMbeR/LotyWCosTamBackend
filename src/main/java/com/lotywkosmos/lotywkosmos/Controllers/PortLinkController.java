package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.PortLink;
import com.lotywkosmos.lotywkosmos.Service.PortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PortLinkController {


    private final PortLinkService portLinkService;

    @GetMapping("/portLinks")
    public List<PortLink> getPortLinks(){
        return portLinkService.getPortLinks();
    }

    @GetMapping("/portLinks/{id}")
    public PortLink getSinglePortLink(@PathVariable long id) {
        return portLinkService.getSinglePort(id);
    }
}
