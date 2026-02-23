package com.example.taskboard.controller;

import com.example.taskboard.model.Task;
import com.example.taskboard.model.TaskList;
import com.example.taskboard.service.TaskListService;
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
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.saveTask(task);
    }
}
