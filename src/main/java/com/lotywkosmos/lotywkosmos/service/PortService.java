package com.lotywkosmos.lotywkosmos.service;

import com.lotywkosmos.lotywkosmos.model.Port;
import com.lotywkosmos.lotywkosmos.repository.PortRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PortService {
    private final PortRepository portRepository;//injection

    public List<Port> getPorts(){
        return portRepository.findAll();
    }

    public Port getSinglePort(long id) {
        return portRepository.findById(id)
                .orElseThrow();
    }

    public void addPortToBase(Port port) {
        portRepository.save(port);
    }
}
