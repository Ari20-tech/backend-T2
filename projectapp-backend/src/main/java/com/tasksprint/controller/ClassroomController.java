package com.tasksprint.controller;



import com.tasksprint.dto.ClassroomDTO;
import com.tasksprint.model.Classroom;
import com.tasksprint.service.IClassroomService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/classroom")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ClassroomController {
    private final IClassroomService service;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<ClassroomDTO>> findAll() throws  Exception{
        List<ClassroomDTO> list = service.findAll().stream().map(this::converToDto).toList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassroomDTO> findById(@PathVariable("id") Integer id) throws Exception{
        ClassroomDTO obj =  converToDto(service.findById(id));
        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody ClassroomDTO dto) throws Exception{
        Classroom obj =  service.save(convertToEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdClassroom()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassroomDTO> update(@Valid @PathVariable("id") Integer id, @RequestBody ClassroomDTO dto) throws Exception{
        Classroom obj = service.update(convertToEntity(dto), id);
        return ResponseEntity.ok(converToDto(obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    private ClassroomDTO converToDto(Classroom obj){
        return modelMapper.map(obj, ClassroomDTO.class);
    }

    private Classroom convertToEntity(ClassroomDTO dto){
        return modelMapper.map(dto, Classroom.class);
    }
}
