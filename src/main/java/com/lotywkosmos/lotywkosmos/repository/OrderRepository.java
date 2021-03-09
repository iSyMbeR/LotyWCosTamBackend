package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
