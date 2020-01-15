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
public class Audit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private String auditId;

    /**
     * 订单信息
     */
    private String orderId;

    /**
     * 审核是否通过（1通过2不通过）
     */
    private String auditThrough;

    /**
     * 创建时间
     */
    private String createTime;


    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAuditThrough() {
        return auditThrough;
    }

    public void setAuditThrough(String auditThrough) {
        this.auditThrough = auditThrough;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Audit{" +
        "auditId=" + auditId +
        ", orderId=" + orderId +
        ", auditThrough=" + auditThrough +
        ", createTime=" + createTime +
        "}";
    }
}
