package com.example.taskboard.controller;

import com.example.taskboard.dto.TaskDto;
import com.example.taskboard.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskDto> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    public TaskDto saveTask(@RequestBody TaskDto task) {
        return this.taskService.saveTask(task);
    }
}
