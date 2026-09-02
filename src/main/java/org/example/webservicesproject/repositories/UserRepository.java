package org.example.webservicesproject.repositories;

import org.example.webservicesproject.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
