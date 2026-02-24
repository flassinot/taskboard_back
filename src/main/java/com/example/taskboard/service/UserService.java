package com.example.taskboard.service;

import com.example.taskboard.dto.UserDto;
import com.example.taskboard.model.User;
import com.example.taskboard.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers() {
        return StreamSupport.stream(this.userRepository.findAll().spliterator(), false)
                .map(user -> mapToUserDto(user))
                .toList();
    }

    private static UserDto mapToUserDto(User user) {
        return UserDto
                .builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}
