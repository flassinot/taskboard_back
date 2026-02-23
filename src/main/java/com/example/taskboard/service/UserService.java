package com.example.taskboard.service;

import com.example.taskboard.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    public List<User> getUsers() {
        return List.of(
                User.builder()
                        .id(1L)
                        .firstName("Roger")
                        .lastName("Moore")
                        .build(),
                User.builder()
                        .id(2L)
                        .firstName("Sean")
                        .lastName("Connery")
                        .build()
                );
    }
}
