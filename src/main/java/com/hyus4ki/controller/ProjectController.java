package com.hyus4ki.controller;

import com.hyus4ki.mapper.ProjectMapper;
import com.hyus4ki.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<?> findAll() {
        return service.findAll()
                .stream()
                .map(ProjectMapper::toResponse)
                .toList();
    }
}
