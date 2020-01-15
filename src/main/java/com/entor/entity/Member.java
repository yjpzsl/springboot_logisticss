package com.entor.entity;

import java.util.Date;

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
public class Member implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 会员编号
     */
    private String memberId;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 会员账号
     */
    private String memberUsername;

    /**
     * 会员密码
     */
    private String memberPassword;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Member{" +
        "memberId=" + memberId +
        ", memberName=" + memberName +
        ", memberUsername=" + memberUsername +
        ", memberPassword=" + memberPassword +
        ", createTime=" + createTime +
        "}";
    }
}
