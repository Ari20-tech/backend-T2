package com.tasksprint.service.impl;

import com.tasksprint.model.Classroom;
import com.tasksprint.repo.IClassroomRepo;
import com.tasksprint.repo.IGenericRepo;
import com.tasksprint.service.IClassroomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassroomService extends GenericService<Classroom,Integer> implements IClassroomService {
    private final IClassroomRepo repo;

    @Override
    protected IGenericRepo<Classroom, Integer> getRepo() {
        return repo;
    }
}
