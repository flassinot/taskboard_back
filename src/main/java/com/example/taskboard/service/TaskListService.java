package com.example.taskboard.service;

import com.example.taskboard.dto.TaskListDto;
import com.example.taskboard.model.TaskList;
import com.example.taskboard.repository.TaskListRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.StreamSupport;

@Component
public class TaskListService {

    private TaskListRepository taskListRepository;

    public TaskListService(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    public List<TaskListDto> getTaskLists() {
        return StreamSupport.stream(this.taskListRepository.findAll().spliterator(), false)
                .map(t -> mapToTaskListDto(t))
                .toList();
    }

    public TaskListDto mapToTaskListDto(TaskList taskList) {
        return TaskListDto.builder()
                .id(taskList.getId())
                .description(taskList.getDescription())
                .build();
    }
}