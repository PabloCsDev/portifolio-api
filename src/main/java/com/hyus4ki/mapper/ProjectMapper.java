package com.hyus4ki.mapper;

import com.hyus4ki.domain.Project;
import com.hyus4ki.dto.ProjectResponse;

public class ProjectMapper {

    public static ProjectResponse toResponse(Project project) {
        return new ProjectResponse(
                project.getId(),
                project.getTitle(),
                project.getSummary(),
                project.getDescription(),
                project.getStack(),
                project.getRepositoryUrl()
        );
    }
}
