package com.example.taskboard.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String lastName;
    private String firstName;
}
