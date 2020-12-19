package com.oop.social_network_project.models;

import com.oop.social_network_project.enums.POST_TYPE;

import java.util.Map;

public abstract class Post {
    private User author;
    private String postId;
    private String title;
    private String description;
    private long createdDate;
    private POST_TYPE postType;

    protected Post() {
    }

    public Map<String, Object> toMap() {
        return null;
    }
}
