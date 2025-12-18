package com.hyus4ki.dto;

import java.util.List;

public record ProjectResponse(
        Long id,
        String title,
        String summary,
        String description,
        List<String> stack,
        String repositoryUrl
) {}
