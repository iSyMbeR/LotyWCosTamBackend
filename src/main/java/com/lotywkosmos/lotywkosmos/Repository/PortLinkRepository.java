package com.lotywkosmos.lotywkosmos.Repository;

import com.lotywkosmos.lotywkosmos.Model.PortLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortLinkRepository extends JpaRepository<PortLink, Long> {
}
