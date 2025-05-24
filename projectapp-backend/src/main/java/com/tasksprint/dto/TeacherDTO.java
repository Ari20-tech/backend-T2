package com.tasksprint.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDTO {
    @NotNull(message = "El ID del profesor no puede ser nulo")
    private Integer idTeacher;

    @NotBlank(message = "El código del profesor no puede estar vacío")
    @Size(min = 5, max = 20, message = "El código debe tener entre 5 y 20 caracteres")
    public String code;

    @NotBlank(message = "El apellido materno no puede estar vacío")
    @Size(min = 2, max = 30, message = "El apellido materno debe tener entre 2 y 30 caracteres")
    public String motherLastname;

    @NotBlank(message = "El apellido paterno no puede estar vacío")
    @Size(min = 2, max = 30, message = "El apellido paterno debe tener entre 2 y 30 caracteres")
    public String fatherLastname;

    @NotBlank(message = "El primer nombre no puede estar vacío")
    @Size(min = 2, max = 30, message = "El primer nombre debe tener entre 2 y 30 caracteres")
    public String firstName;

    @Size(max = 30, message = "El segundo nombre no puede tener más de 30 caracteres")
    public String secondName;

}