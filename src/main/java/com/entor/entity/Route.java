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
public class Route implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 路线编号
     */
    private String routeId;

    /**
     * 路线长度
     */
    private String routeLength;

    /**
     * 收费站数量
     */
    private Integer routeStation;

    /**
     * 过路费
     */
    private String routeTolls;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(String routeLength) {
        this.routeLength = routeLength;
    }

    public Integer getRouteStation() {
        return routeStation;
    }

    public void setRouteStation(Integer routeStation) {
        this.routeStation = routeStation;
    }

    public String getRouteTolls() {
        return routeTolls;
    }

    public void setRouteTolls(String routeTolls) {
        this.routeTolls = routeTolls;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Route{" +
        "routeId=" + routeId +
        ", routeLength=" + routeLength +
        ", routeStation=" + routeStation +
        ", routeTolls=" + routeTolls +
        ", createTime=" + createTime +
        "}";
    }
}
