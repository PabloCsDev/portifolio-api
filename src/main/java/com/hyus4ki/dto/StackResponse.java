package com.hyus4ki.dto;

import lombok.Data;
import java.util.List;

@Data
public class StackResponse {

    private List<Category> categories;
    private Meta meta;

    @Data
    public static class Category {
        private String id;
        private String label;
        private List<Item> items;
    }

    @Data
    public static class Item {
        private String name;
        private String level;
    }

    @Data
    public static class Meta {
        private boolean alwaysLearning;
        private String learningMessage;
    }
}
