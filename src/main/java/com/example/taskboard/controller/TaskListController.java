package com.example.taskboard.controller;

import com.example.taskboard.model.Task;
import com.example.taskboard.model.TaskList;
import com.example.taskboard.service.TaskListService;
import com.example.taskboard.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasklists")
public class TaskListController {

    private TaskListService taskListService;

    public TaskListController(TaskListService taskListService) {
        this.taskListService = taskListService;
    }

    @GetMapping()
    public List<TaskList> getTaskLists() {
        return taskListService.getTaskLists();
    }
}
