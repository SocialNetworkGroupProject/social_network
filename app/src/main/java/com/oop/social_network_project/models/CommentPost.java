package com.oop.social_network_project.models;

import java.util.Map;
import java.util.Set;

public class CommentPost extends Post{
    private Set<Like> likeList;

    private CommentPost(){

    }

    @Override
    public Map<String, Object> toMap() {
        return super.toMap();
    }
}
