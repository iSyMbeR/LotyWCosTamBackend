package com.lotywkosmos.lotywkosmos.Repository;

import com.lotywkosmos.lotywkosmos.Model.Flight;
import com.lotywkosmos.lotywkosmos.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
