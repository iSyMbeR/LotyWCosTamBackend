package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.PortLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortLinkRepository extends JpaRepository<PortLink, Long> {
}
