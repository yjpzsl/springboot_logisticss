package com.entor.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
public class Auth implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 权限编号
     */
    private String authId;

    /**
     * 权限名称
     */
    private String name;


    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auth{" +
        "authId=" + authId +
        ", name=" + name +
        "}";
    }
}
