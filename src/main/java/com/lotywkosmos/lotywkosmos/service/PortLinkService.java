package com.lotywkosmos.lotywkosmos.service;

import com.lotywkosmos.lotywkosmos.model.PortLink;
import com.lotywkosmos.lotywkosmos.repository.PortLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PortLinkService {
    private final PortLinkRepository portLinkRepository;//injection

    public List<PortLink> getPortLinks(){
        return portLinkRepository.findAll();
    }

    public PortLink getSinglePort(long id) {
        return portLinkRepository.findById(id)
                .orElseThrow();
    }

    public void addPortLinkToBase(PortLink portLink) {
        portLinkRepository.save(portLink);
    }
}
