package com.entor.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
public class Ordinary implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 普通用户编号
     */
    private String ordinaryId;

    /**
     * 普通用户名称
     */
    private String ordinaryName;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getOrdinaryId() {
        return ordinaryId;
    }

    public void setOrdinaryId(String ordinaryId) {
        this.ordinaryId = ordinaryId;
    }

    public String getOrdinaryName() {
        return ordinaryName;
    }

    public void setOrdinaryName(String ordinaryName) {
        this.ordinaryName = ordinaryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Ordinary{" +
        "ordinaryId=" + ordinaryId +
        ", ordinaryName=" + ordinaryName +
        ", createTime=" + createTime +
        "}";
    }
}
