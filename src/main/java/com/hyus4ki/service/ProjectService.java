package com.hyus4ki.service;

import com.hyus4ki.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> findAll() {
        return List.of(
                new Project(
                        1L,
                        "Sistema de Processamento Assíncrono",
                        "Mensageria com retry e DLQ",
                        "API em Spring Boot integrada ao RabbitMQ para processamento assíncrono de mensagens, com tratamento de falhas e retentativas automáticas.",
                        List.of("Java", "Spring Boot", "RabbitMQ"),
                        "https://github.com/PabloCsDev/async-processing"
                ),
                new Project(
                        2L,
                        "API com Cache Inteligente",
                        "Cache com Redis e invalidação",
                        "API REST com Redis para cache de endpoints, aplicando estratégias de invalidação para garantir consistência e performance.",
                        List.of("Java", "Spring Boot", "Redis"),
                        "https://github.com/PabloCsDev/api-cache"
                ),
                new Project(
                        3L,
                        "Feature Flag Manager",
                        "Controle de features em runtime",
                        "Sistema para ativação e desativação de funcionalidades em tempo real, permitindo mudanças de comportamento sem necessidade de redeploy.",
                        List.of("Java", "Spring Boot"),
                        "https://github.com/PabloCsDev/feature-flag"
                )
        );
    }
}
