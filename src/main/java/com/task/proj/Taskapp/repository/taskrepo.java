package com.task.proj.Taskapp.repository;

import com.task.proj.Taskapp.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskrepo extends JpaRepository<Tasks, Integer> {
}
