package com.lotywkosmos.lotywkosmos.Repository;

import com.lotywkosmos.lotywkosmos.Model.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRepository extends JpaRepository<Port, Long> {
}
