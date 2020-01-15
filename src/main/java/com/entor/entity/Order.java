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
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 订单编号
	 */
	private String orderId;

	/**
	 * 用户等级（1为会员2为普通）
	 */
	private Integer user;

	/**
	 * 货物编号
	 */
	private String goodsId;

	/**
	 * 订单收件人
	 */
	private String orderRecipient;

	/**
	 * 寄件人
	 */
	private String orderSender;

	/**
	 * 存放仓库
	 */
	private String warehouseId;

	/**
	 * 收货地址
	 */
	private String orderAddress;

	/**
	 * 订单审核（1通过2不通过）
	 */
	private String auditId;

	/**
	 * 联系电话
	 */
	private Integer phone;

	/**
	 * 所需金额
	 */
	private String orderMoney;

	/**
	 * 创建时间
	 */
	private Date createTime;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOrderRecipient() {
		return orderRecipient;
	}

	public void setOrderRecipient(String orderRecipient) {
		this.orderRecipient = orderRecipient;
	}

	public String getOrderSender() {
		return orderSender;
	}

	public void setOrderSender(String orderSender) {
		this.orderSender = orderSender;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", goodsId=" + goodsId + ", orderRecipient="
				+ orderRecipient + ", orderSender=" + orderSender + ", warehouseId=" + warehouseId + ", orderAddress="
				+ orderAddress + ", auditId=" + auditId + ", phone=" + phone + ", orderMoney=" + orderMoney
				+ ", createTime=" + createTime + "]";
	}
	
}