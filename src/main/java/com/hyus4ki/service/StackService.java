package com.hyus4ki.service;

import com.hyus4ki.dto.StackResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackService {

    public StackResponse getStack() {

        StackResponse response = new StackResponse();

        response.setCategories(List.of(

                category(
                        "backend",
                        "Backend",
                        item("Java", "production"),
                        item("Spring Boot", "production"),
                        item("Spring Security", "production"),
                        item("JPA / Hibernate", "production")
                ),

                category(
                        "frontend",
                        "Frontend",
                        item("Angular", "production"),
                        item("TypeScript", "production"),
                        item("JavaScript", "learning")
                ),

                category(
                        "database",
                        "Banco de Dados",
                        item("PostgreSQL", "production"),
                        item("Redis", "production"),
                        item("MySQL", "learning")

                ),

                category(
                        "devops",
                        "DevOps & Infra",
                        item("Docker", "production"),
                        item("RabbitMQ", "production"),
                        item("Git", "production"),
                        item("GitHub", "production"),
                        item("Linux","production")
                ),

                category(
                        "concepts",
                        "Conceitos & Arquitetura",
                        item("APIs REST", "production"),
                        item("Processamento assíncrono", "production"),
                        item("Arquitetura em camadas", "production"),
                        item("Clean Code", "production"),
                        item("SOLID", "production")
                )
        ));

        StackResponse.Meta meta = new StackResponse.Meta();
        meta.setAlwaysLearning(true);
        meta.setLearningMessage(
                "Aprendizado contínuo com foco em arquitetura, performance e sistemas distribuídos"
        );

        response.setMeta(meta);

        return response;
    }

    // helpers ↓↓↓

    private StackResponse.Category category(String id, String label, StackResponse.Item... items) {
        StackResponse.Category c = new StackResponse.Category();
        c.setId(id);
        c.setLabel(label);
        c.setItems(List.of(items));
        return c;
    }

    private StackResponse.Item item(String name, String level) {
        StackResponse.Item i = new StackResponse.Item();
        i.setName(name);
        i.setLevel(level);
        return i;
    }
}
