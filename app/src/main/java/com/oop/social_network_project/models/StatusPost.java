package com.oop.social_network_project.models;

import org.w3c.dom.Comment;

import java.util.Map;
import java.util.Set;

public class StatusPost extends Post{
    private String photoURL;
    private String photoTitle;
    private Set<Like> likeList;
    private Set<CommentPost> commentsList;

    private StatusPost(){

    }

    @Override
    public Map<String, Object> toMap() {
        return super.toMap();
    }
}
