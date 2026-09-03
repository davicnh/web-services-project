package org.example.webservicesproject.repositories;

import org.example.webservicesproject.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
