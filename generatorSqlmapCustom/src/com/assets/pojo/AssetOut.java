package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetOut {
    private Integer id;

    private Integer psnCode;

    private String currentMonth;

    private BigDecimal originalCapital;

    private BigDecimal incomeSurplus;

    private BigDecimal ratainedProfit;

    private String tagStatus;

    private Date createDate;

    private String currentYear;

    private String jsonData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPsnCode() {
        return psnCode;
    }

    public void setPsnCode(Integer psnCode) {
        this.psnCode = psnCode;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
    }

    public BigDecimal getOriginalCapital() {
        return originalCapital;
    }

    public void setOriginalCapital(BigDecimal originalCapital) {
        this.originalCapital = originalCapital;
    }

    public BigDecimal getIncomeSurplus() {
        return incomeSurplus;
    }

    public void setIncomeSurplus(BigDecimal incomeSurplus) {
        this.incomeSurplus = incomeSurplus;
    }

    public BigDecimal getRatainedProfit() {
        return ratainedProfit;
    }

    public void setRatainedProfit(BigDecimal ratainedProfit) {
        this.ratainedProfit = ratainedProfit;
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

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData == null ? null : jsonData.trim();
    }
}