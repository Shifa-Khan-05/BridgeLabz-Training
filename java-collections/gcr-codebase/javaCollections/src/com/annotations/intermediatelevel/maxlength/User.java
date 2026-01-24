package com.annotations.intermediatelevel.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        Field field = this.getClass().getDeclaredField("username");
        MaxLength max = field.getAnnotation(MaxLength.class);

        if (username.length() > max.value()) {
            throw new IllegalArgumentException("Username too long");
        }
        this.username = username;
    }
}
