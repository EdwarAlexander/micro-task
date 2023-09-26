package com.deved.microtask.infraestructure.service;

import com.deved.microtask.api.models.request.TaskRequest;
import com.deved.microtask.api.models.response.TaskResponseDto;

public interface ITaskService extends CrudServices<TaskRequest, TaskResponseDto, Long>{

}
