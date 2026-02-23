package com.example.taskboard.service;

import com.example.taskboard.model.Task;
import com.example.taskboard.model.TaskList;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TaskService {

    @Getter
    private List<Task> tasks = new ArrayList<>();
    private TaskListService taskListService;

    public TaskService(TaskListService taskListService) {
        this.taskListService = taskListService;
    }

    public Task saveTask(Task task) {
        if (task.getId() != null) {
            this.tasks.stream().filter(
                            t -> t.getId() != null
                                    && t.getId().equals(task.getId())).findFirst()
                    .ifPresent((t) -> {
                        this.tasks.remove(t);
                    });
        } else {
            task.setId((long) tasks.size() + 1);
        }
        this.tasks.add(task);
        return task;
    }

    @PostConstruct
    public void initTasks() {
        TaskList todo = taskListService.getTaskLists()
                .stream()
                .filter(t -> t.getId().equals(1L))
                .findFirst()
                .get();

        this.tasks = new ArrayList<>(List.of(
                Task.builder()
                        .id(1L)
                        .description("git")
                        .taskListId(todo.getId())
                        .build(),
                Task.builder()
                        .id(2L)
                        .description("ajout services")
                        .taskListId(todo.getId())
                        .build()
        ));
    }
}