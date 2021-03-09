package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.PortLink;
import com.lotywkosmos.lotywkosmos.service.PortLinkService;
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
