package org.example.webservicesproject.repositories;

import org.example.webservicesproject.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
