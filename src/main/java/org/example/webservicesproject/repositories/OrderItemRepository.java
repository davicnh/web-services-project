package org.example.webservicesproject.repositories;

import org.example.webservicesproject.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
