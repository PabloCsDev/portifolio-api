package com.hyus4ki.controller;

import com.hyus4ki.dto.StackResponse;
import com.hyus4ki.service.StackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stack")
public class StackController {

    private final StackService service;

    public StackController(StackService service) {
        this.service = service;
    }

    @GetMapping
    public StackResponse getStack() {
        return service.getStack();
    }
}
