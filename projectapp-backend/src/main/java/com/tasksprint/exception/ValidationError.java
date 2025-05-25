package com.tasksprint.exception;

public record ValidationError(
        String field,
        String message
) {}