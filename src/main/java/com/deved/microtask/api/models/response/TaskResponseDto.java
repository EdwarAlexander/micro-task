package com.deved.microtask.api.models.response;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TaskResponseDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private Date fechaRegistro;
}
