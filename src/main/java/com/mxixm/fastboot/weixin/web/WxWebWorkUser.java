

package com.mxixm.fastboot.weixin.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * FastBootWeixin WxWebWorkUser
 *
 * @author Gary
 * @date 2019/05/16 23:47
 * @since 0.1.2
 */
public class WxWebWorkUser implements Serializable {

    private static final long serialVersionUID = -3316291694899477421L;
    @JsonProperty("errcode")
    private int errorCode;

    @JsonProperty("errmsg")
    private String errorMessage;

    /**
     * 用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
     */
    @JsonProperty("UserId")
    private String userId;

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    @JsonProperty("DeviceId")
    private String deviceId;

    @JsonIgnore
    private Date createTime = new Date();

    public WxWebWorkUser() {
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WxWebWorkUser{" +
                "errorCode=" + errorCode +
                ", errorMessage=" + errorMessage +
                ", userId='" + userId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
