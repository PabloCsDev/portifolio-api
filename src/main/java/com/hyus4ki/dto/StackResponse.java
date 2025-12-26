package com.hyus4ki.dto;

import java.util.List;

public class StackResponse {

    private List<Category> categories;
    private Meta meta;

    // getters / setters

    public static class Category {
        private String id;
        private String label;
        private List<Item> items;

        // getters / setters
    }

    public static class Item {
        private String name;
        private String level; // production | learning

        // getters / setters
    }

    public static class Meta {
        private boolean alwaysLearning;
        private String learningMessage;

        // getters / setters
    }
}
