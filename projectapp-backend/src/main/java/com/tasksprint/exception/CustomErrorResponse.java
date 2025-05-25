package com.tasksprint.exception;

import java.time.LocalDateTime;
import java.util.List;

public record CustomErrorResponse(
        LocalDateTime timestamp,
        String message,
        String details,
        List<ValidationError> errors
) {}