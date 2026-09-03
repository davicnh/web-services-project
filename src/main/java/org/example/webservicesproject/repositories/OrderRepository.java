package org.example.webservicesproject.repositories;

import org.example.webservicesproject.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}

