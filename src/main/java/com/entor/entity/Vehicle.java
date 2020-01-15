package com.entor.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
public class Vehicle implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 货车编号
     */
    @TableId(type=IdType.ASSIGN_UUID)
    private String vehicleId;

    /**
     * 货车型号
     */
    private String vehicleModel;

    /**
     * 车牌号
     */
    private String vehicleLicense;

    /**
     * 能拉多重的货
     */
    private String vehicleWeight;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;


    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public String getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(String vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
        "vehicleId=" + vehicleId +
        ", vehicleModel=" + vehicleModel +
        ", vehicleLicense=" + vehicleLicense +
        ", vehicleWeight=" + vehicleWeight +
        ", createTime=" + createTime +
        "}";
    }
}
