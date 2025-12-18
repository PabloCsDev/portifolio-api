package com.hyus4ki.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private Long id;
    private String title;
    private String summary;
    private String description;
    private List<String> stack;
    private String repositoryUrl;
}
