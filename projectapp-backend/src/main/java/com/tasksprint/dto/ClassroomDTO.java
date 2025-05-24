package com.tasksprint.dto;

import com.tasksprint.model.Career;
import com.tasksprint.model.Course;
import com.tasksprint.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassroomDTO {
    private Integer idClassroom;
    private Integer nrc;
    private Course course;
    private Teacher teacher;
    private Career career;
    private String semester;
    private Integer level;
    private Boolean status;
}
