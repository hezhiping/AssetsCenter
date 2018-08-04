package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SysUser {
    private Integer userid;

    private String loginName;

    private String password;

    private Integer enabled;

    private Integer tokenChanged;

    private Integer nodeId;

    private String email;

    private BigDecimal mobile;

    private String ukeysn;

    private String ukeypwd;

    private String isukey;

    private String isinternal;

    private String plainPwd;

    private Integer addUserId;

    private String authLoginIp;

    private String lastAccessIp;

    private String locale;

    private Date passwordUpdateTime;

    private Date lastLoginTime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getTokenChanged() {
        return tokenChanged;
    }

    public void setTokenChanged(Integer tokenChanged) {
        this.tokenChanged = tokenChanged;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getMobile() {
        return mobile;
    }

    public void setMobile(BigDecimal mobile) {
        this.mobile = mobile;
    }

    public String getUkeysn() {
        return ukeysn;
    }

    public void setUkeysn(String ukeysn) {
        this.ukeysn = ukeysn == null ? null : ukeysn.trim();
    }

    public String getUkeypwd() {
        return ukeypwd;
    }

    public void setUkeypwd(String ukeypwd) {
        this.ukeypwd = ukeypwd == null ? null : ukeypwd.trim();
    }

    public String getIsukey() {
        return isukey;
    }

    public void setIsukey(String isukey) {
        this.isukey = isukey == null ? null : isukey.trim();
    }

    public String getIsinternal() {
        return isinternal;
    }

    public void setIsinternal(String isinternal) {
        this.isinternal = isinternal == null ? null : isinternal.trim();
    }

    public String getPlainPwd() {
        return plainPwd;
    }

    public void setPlainPwd(String plainPwd) {
        this.plainPwd = plainPwd == null ? null : plainPwd.trim();
    }

    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    public String getAuthLoginIp() {
        return authLoginIp;
    }

    public void setAuthLoginIp(String authLoginIp) {
        this.authLoginIp = authLoginIp == null ? null : authLoginIp.trim();
    }

    public String getLastAccessIp() {
        return lastAccessIp;
    }

    public void setLastAccessIp(String lastAccessIp) {
        this.lastAccessIp = lastAccessIp == null ? null : lastAccessIp.trim();
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}