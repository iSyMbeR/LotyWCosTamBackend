package com.lotywkosmos.lotywkosmos.Repository;

import com.lotywkosmos.lotywkosmos.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
