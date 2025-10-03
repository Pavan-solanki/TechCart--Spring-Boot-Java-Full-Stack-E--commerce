package com.SpringEcomer.Spring_Eccomerce.Repo;


import com.SpringEcomer.Spring_Eccomerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    Optional<Order> findByOrderId(String orderId);
}
