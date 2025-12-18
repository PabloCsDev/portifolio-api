package com.hyus4ki.dto;

public record ProfileResponse(
        String name,
        String title,
        String summary,
        String location,
        String github,
        String linkedin,
        String email
) {}
