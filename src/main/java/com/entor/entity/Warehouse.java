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
public class Warehouse implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 仓库编号
     */
    private String warehouseId;

    /**
     * 仓库位置
     */
    private String warehousePosition;

    /**
     * 仓库大小
     */
    private String warehouseSize;

    /**
     * 仓库租金
     */
    private Integer warehouseRent;

    /**
     * 仓库管理者
     */
    private String warehouseController;

    /**
     * 仓库员工数量
     */
    private Integer warehouseStaffNumber;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehousePosition() {
        return warehousePosition;
    }

    public void setWarehousePosition(String warehousePosition) {
        this.warehousePosition = warehousePosition;
    }

    public String getWarehouseSize() {
        return warehouseSize;
    }

    public void setWarehouseSize(String warehouseSize) {
        this.warehouseSize = warehouseSize;
    }

    public Integer getWarehouseRent() {
        return warehouseRent;
    }

    public void setWarehouseRent(Integer warehouseRent) {
        this.warehouseRent = warehouseRent;
    }

    public String getWarehouseController() {
        return warehouseController;
    }

    public void setWarehouseController(String warehouseController) {
        this.warehouseController = warehouseController;
    }

    public Integer getWarehouseStaffNumber() {
        return warehouseStaffNumber;
    }

    public void setWarehouseStaffNumber(Integer warehouseStaffNumber) {
        this.warehouseStaffNumber = warehouseStaffNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        "warehouseId=" + warehouseId +
        ", warehousePosition=" + warehousePosition +
        ", warehouseSize=" + warehouseSize +
        ", warehouseRent=" + warehouseRent +
        ", warehouseController=" + warehouseController +
        ", warehouseStaffNumber=" + warehouseStaffNumber +
        ", createTime=" + createTime +
        "}";
    }
}
