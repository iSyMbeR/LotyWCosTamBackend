package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
