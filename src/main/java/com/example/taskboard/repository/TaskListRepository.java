package com.example.taskboard.repository;

import com.example.taskboard.model.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends CrudRepository<TaskList,Long> {
}
