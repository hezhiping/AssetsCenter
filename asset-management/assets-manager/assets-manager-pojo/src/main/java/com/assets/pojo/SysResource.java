package com.assets.pojo;

import java.math.BigDecimal;

public class SysResource {
    private Long resourceId;

    private String resourceType;

    private String value;

    private Short orderNum;

    private Long parentId;

    private String target;

    private String zhCnName;

    private Short status;

    private Short lavels;

    private String remark;

    private String imgUrl;

    private String totalSql;

    private String navImgUrl;

    private Short navEnabled;

    private String oldTotalSql;

    private String zhTwName;

    private String enUsName;

    private String flagLan;

    private BigDecimal stmsMenuId;

    private String className;
    
    private Long id;
    
    public  SysResource() {
		id = resourceId;
	}    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getZhCnName() {
        return zhCnName;
    }

    public void setZhCnName(String zhCnName) {
        this.zhCnName = zhCnName == null ? null : zhCnName.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getLavels() {
        return lavels;
    }

    public void setLavels(Short lavels) {
        this.lavels = lavels;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getTotalSql() {
        return totalSql;
    }

    public void setTotalSql(String totalSql) {
        this.totalSql = totalSql == null ? null : totalSql.trim();
    }

    public String getNavImgUrl() {
        return navImgUrl;
    }

    public void setNavImgUrl(String navImgUrl) {
        this.navImgUrl = navImgUrl == null ? null : navImgUrl.trim();
    }

    public Short getNavEnabled() {
        return navEnabled;
    }

    public void setNavEnabled(Short navEnabled) {
        this.navEnabled = navEnabled;
    }

    public String getOldTotalSql() {
        return oldTotalSql;
    }

    public void setOldTotalSql(String oldTotalSql) {
        this.oldTotalSql = oldTotalSql == null ? null : oldTotalSql.trim();
    }

    public String getZhTwName() {
        return zhTwName;
    }

    public void setZhTwName(String zhTwName) {
        this.zhTwName = zhTwName == null ? null : zhTwName.trim();
    }

    public String getEnUsName() {
        return enUsName;
    }

    public void setEnUsName(String enUsName) {
        this.enUsName = enUsName == null ? null : enUsName.trim();
    }

    public String getFlagLan() {
        return flagLan;
    }

    public void setFlagLan(String flagLan) {
        this.flagLan = flagLan == null ? null : flagLan.trim();
    }

    public BigDecimal getStmsMenuId() {
        return stmsMenuId;
    }

    public void setStmsMenuId(BigDecimal stmsMenuId) {
        this.stmsMenuId = stmsMenuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}