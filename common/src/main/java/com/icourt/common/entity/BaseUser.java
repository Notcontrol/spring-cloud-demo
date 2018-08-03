package com.icourt.common.entity;

/**
 * 用户实体
 *
 * @author jianglu
 * Created 2018 - 08 - 03 - TIME
 */
public class BaseUser {
    private String username;

    private String password;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
