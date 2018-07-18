package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FixedAsset extends FixedAssetKey {
    private Date currentMonthDate;

    private Integer psnCode;

    private BigDecimal assetMoney;

    private String tagStatus;

    private Date createDate;

    private String assetRemark;

    public Date getCurrentMonthDate() {
        return currentMonthDate;
    }

    public void setCurrentMonthDate(Date currentMonthDate) {
        this.currentMonthDate = currentMonthDate;
    }

    public Integer getPsnCode() {
        return psnCode;
    }

    public void setPsnCode(Integer psnCode) {
        this.psnCode = psnCode;
    }

    public BigDecimal getAssetMoney() {
        return assetMoney;
    }

    public void setAssetMoney(BigDecimal assetMoney) {
        this.assetMoney = assetMoney;
    }

    public String getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus == null ? null : tagStatus.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAssetRemark() {
        return assetRemark;
    }

    public void setAssetRemark(String assetRemark) {
        this.assetRemark = assetRemark == null ? null : assetRemark.trim();
    }
}