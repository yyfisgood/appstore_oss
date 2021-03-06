package com.jd.appstore.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 12-7-5
 * Time: 上午11:12
 * To change this template use File | Settings | File Templates.
 * 应用下载日志表
 */
public class AppDownloadLog implements Serializable{
    /**
     * 应用下载日志表主键
     */
    private Integer id;
    /**
     * 用户pin
     */
    private String pin;
    /**
     * 应用编号
     */
    private Integer appId;
    /**
     * 所属订单编号
     */
    private Integer orderId;
    /**
     * 下载时间
     */
    private Date downloadTime;
    /**
     * 下载是否成功
     */
    private Integer downloadSucceed;
    /**
     * 客户端类型
     */
    private Integer clientType;
    /**
     * 终端uuid
     */
    private String uuid;
    /**
     * IP
     */
    private String ip;
    /**
     * 设备型号
     */
    private String terminalModel;
    /**
     * 记录创建时间
     */
    private Date created;
    /**
     * 记录修改时间
     */
    private Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }

    public Integer getDownloadSucceed() {
        return downloadSucceed;
    }

    public void setDownloadSucceed(Integer downloadSucceed) {
        this.downloadSucceed = downloadSucceed;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
