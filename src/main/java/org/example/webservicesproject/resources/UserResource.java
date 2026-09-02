package org.example.webservicesproject.resources;

import org.example.webservicesproject.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALL() {
        User user = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
