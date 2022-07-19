package com.task.proj.Taskapp.service;

import com.task.proj.Taskapp.model.Tasks;
import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Optional;

public interface Taskservice {
    List<Tasks> getalltask();
    Tasks addtask(Tasks task);

    Optional<Tasks> findtask(int id);

    Optional<Tasks> updatetask(Tasks task);

    String deletetask(int id);
}
