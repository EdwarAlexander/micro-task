package com.deved.microtask.infraestructure.serviceimpl;

import com.deved.microtask.api.models.request.TaskRequest;
import com.deved.microtask.api.models.response.TaskResponseDto;
import com.deved.microtask.domain.repository.TaskRepository;
import com.deved.microtask.infraestructure.service.ITaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements ITaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskResponseDto create(TaskRequest request) {
        return null;
    }

    @Override
    public TaskResponseDto read(Long aLong) {
        return null;
    }

    @Override
    public TaskResponseDto update(TaskRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
