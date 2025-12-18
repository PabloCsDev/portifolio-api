package com.hyus4ki.dto;

import java.util.List;

public record StackResponse(
        List<String> languages,
        List<String> frameworks,
        List<String> infrastructure,
        List<String> concepts
) {}
