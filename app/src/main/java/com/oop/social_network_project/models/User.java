package com.oop.social_network_project.models;

import androidx.annotation.Nullable;

import com.oop.social_network_project.enums.LOGIN_TYPE;

import java.util.Map;

public class User {
    private String userId;
    private String userEmail;
    private String userPhoneNumber;
    private String userName;
    private LOGIN_TYPE loginType;

    protected User() {
    }

    @Override
    public int hashCode() {
        return 31 + this.userId.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object user) {
        return (user instanceof User) && (this.userId != null)?
                this.userId.equals(((User)user).userId):
                user == this;
    }

    public Map<String, Object> toMap() {
        return null;
    }
}
