package com.example.taskboard.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    private Long id;

    private String description;

    private Long userId;

    private Long taskListId;
}
