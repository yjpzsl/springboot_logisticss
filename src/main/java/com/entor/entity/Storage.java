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
public class Storage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private String storageId;

    /**
     * 货物编号
     */
    private String goodsId;

    /**
     * 仓库编号
     */
    private String warehouseId;

    /**
     * 配送员编号
     */
    private String staffId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Storage{" +
        "storageId=" + storageId +
        ", goodsId=" + goodsId +
        ", warehouseId=" + warehouseId +
        ", staffId=" + staffId +
        ", createTime=" + createTime +
        "}";
    }
}
