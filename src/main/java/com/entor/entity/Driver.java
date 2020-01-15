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
public class Driver implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 司机编号
     */
    private String driverId;

    /**
     * 司机名称
     */
    private String driverName;

    /**
     * 司机年龄
     */
    private Integer driverAge;

    /**
     * 司机驾驶年龄
     */
    private Integer driverDrivingAge;

    /**
     * 货车编号
     */
    private String vehicleId;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public Integer getDriverDrivingAge() {
        return driverDrivingAge;
    }

    public void setDriverDrivingAge(Integer driverDrivingAge) {
        this.driverDrivingAge = driverDrivingAge;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Driver{" +
        "driverId=" + driverId +
        ", driverName=" + driverName +
        ", driverAge=" + driverAge +
        ", driverDrivingAge=" + driverDrivingAge +
        ", vehicleId=" + vehicleId +
        ", createTime=" + createTime +
        "}";
    }
}
