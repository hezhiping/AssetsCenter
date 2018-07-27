package com.assets.pojo;

import java.util.Date;

public class SysLog {
    private Long logCode;

    private Long psnCode;

    private String logType;

    private String keyCode;

    private Date createDate;

    private String logAction;

    private String clientIp;

    private String serverIp;

    private String userAgent;

    public Long getLogCode() {
        return logCode;
    }

    public void setLogCode(Long logCode) {
        this.logCode = logCode;
    }

    public Long getPsnCode() {
        return psnCode;
    }

    public void setPsnCode(Long psnCode) {
        this.psnCode = psnCode;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode == null ? null : keyCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLogAction() {
        return logAction;
    }

    public void setLogAction(String logAction) {
        this.logAction = logAction == null ? null : logAction.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }
}