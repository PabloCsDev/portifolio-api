package com.hyus4ki.service;

import com.hyus4ki.dto.StackResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackService {

    public StackResponse getStack() {
        return new StackResponse(
                List.of("Java", "JavaScript", "SQL"),
                List.of("Spring Boot", "JPA / Hibernate"),
                List.of("RabbitMQ", "Redis", "Docker", "Git", "GitHub"),
                List.of("APIs REST", "Processamento assíncrono", "Arquitetura em camadas", "Clean Code", "SOLID")
        );
    }
}

