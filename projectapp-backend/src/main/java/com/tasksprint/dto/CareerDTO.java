package com.tasksprint.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CareerDTO {

    private Integer idCareer;

    @NotBlank(message = "El código es obligatorio")
    @Size(max = 10, message = "El código debe tener como máximo 10 caracteres")
    private String code;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre debe tener como máximo 100 caracteres")
    private String name;
}