package com.oop.social_network_project.models;

import java.util.Map;

public class UserProfile extends User{
    private String profileId;
    private String country;
    private String gender;
    private String createdDate;
    private String postCount;
    private String likeCount;
    private String photoUrl;

    private UserProfile(){

    }

    @Override
    public Map<String, Object> toMap() {
        return super.toMap();
    }
}
