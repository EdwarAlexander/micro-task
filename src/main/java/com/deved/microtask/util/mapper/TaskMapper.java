package com.deved.microtask.util.mapper;

import com.deved.microtask.api.models.response.TaskResponseDto;
import com.deved.microtask.domain.entities.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {

    TaskMapper MAPPER = Mappers.getMapper(TaskMapper.class);

    @Mapping(source = "nameTask", target = "nombre")
    @Mapping(source = "descriptionTask", target = "descripcion")
    @Mapping(source = "dateTask", target = "fechaRegistro")
    TaskResponseDto mapToTaskResponseDto(Task task);

    @Mapping(source = "nombre", target = "nameTask")
    @Mapping(source = "descripcion", target = "descriptionTask")
    @Mapping(source = "fechaRegistro", target = "dateTask")
    Task mapToTask(TaskResponseDto taskResponseDto);
}
