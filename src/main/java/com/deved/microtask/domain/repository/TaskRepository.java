package com.deved.microtask.domain.repository;

import com.deved.microtask.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
