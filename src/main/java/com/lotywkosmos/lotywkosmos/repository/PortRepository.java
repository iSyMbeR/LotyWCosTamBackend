package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRepository extends JpaRepository<Port, Long> {
}
