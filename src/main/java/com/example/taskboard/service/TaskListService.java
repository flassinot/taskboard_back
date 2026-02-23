package com.example.taskboard.service;

import com.example.taskboard.model.Task;
import com.example.taskboard.model.TaskList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskListService {

    public List<TaskList> getTaskLists() {
        return List.of(
                TaskList.builder()
                        .id(1L)
                        .description("TODO")
                        .build(),
                TaskList.builder()
                        .id(2L)
                        .description("DOING")
                        .build(),
                TaskList.builder()
                        .id(3L)
                        .description("DONE")
                        .build()
                );
    }
}