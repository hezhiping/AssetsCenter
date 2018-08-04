package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FixedAsset extends FixedAssetKey {
    private String currentMonth;

    private Integer psnCode;

    private BigDecimal assetMoney;

    private String tagStatus;

    private Date createDate;

    private String currentYear;

    private String assetRemark;

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
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

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear == null ? null : currentYear.trim();
    }

    public String getAssetRemark() {
        return assetRemark;
    }

    public void setAssetRemark(String assetRemark) {
        this.assetRemark = assetRemark == null ? null : assetRemark.trim();
    }
}