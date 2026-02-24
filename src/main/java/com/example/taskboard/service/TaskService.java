package com.example.taskboard.service;

import com.example.taskboard.dto.TaskDto;
import com.example.taskboard.dto.TaskListDto;
import com.example.taskboard.model.Task;
import com.example.taskboard.repository.TaskRepository;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Component
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskDto saveTask(TaskDto task) {
        this.taskRepository.save(mapToTask(task));
        return task;
    }

    public List<TaskDto> getTasks() {
        return StreamSupport.stream(this.taskRepository.findAll().spliterator(), false)
                .map(t -> mapToTaskDto(t))
                .toList();
    }

    public TaskDto mapToTaskDto(Task task) {
        return TaskDto.builder()
                .id(task.getId())
                .description(task.getDescription())
                .userId(task.getUserId())
                .taskListId(task.getTaskListId())
                .build();
    }

    public Task mapToTask(TaskDto taskDto) {
        return Task.builder()
                .id(taskDto.getId())
                .description(taskDto.getDescription())
                .userId(taskDto.getUserId())
                .taskListId(taskDto.getTaskListId())
                .build();
    }
}
