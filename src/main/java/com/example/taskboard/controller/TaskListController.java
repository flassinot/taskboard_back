package com.example.taskboard.controller;

import com.example.taskboard.dto.TaskListDto;
import com.example.taskboard.service.TaskListService;
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
    public List<TaskListDto> getTaskLists() {
        return taskListService.getTaskLists();
    }
}
