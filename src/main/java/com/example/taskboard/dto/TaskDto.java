package com.example.taskboard.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    private Long id;
    private String description;
    private Long userId;
    private Long taskListId;
}
