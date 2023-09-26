package com.deved.microtask.api.models.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TaskRequest {

    private String nombre;
    private String descripcion;
}
