package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetIncom {
    private Integer id;

    private Integer psnCode;

    private String currentMonth;

    private BigDecimal dailyIncom;

    private BigDecimal dailyPay;

    private BigDecimal nonDailyIncom;

    private BigDecimal nonDailyPay;

    private BigDecimal addProfit;

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

    public BigDecimal getDailyIncom() {
        return dailyIncom;
    }

    public void setDailyIncom(BigDecimal dailyIncom) {
        this.dailyIncom = dailyIncom;
    }

    public BigDecimal getDailyPay() {
        return dailyPay;
    }

    public void setDailyPay(BigDecimal dailyPay) {
        this.dailyPay = dailyPay;
    }

    public BigDecimal getNonDailyIncom() {
        return nonDailyIncom;
    }

    public void setNonDailyIncom(BigDecimal nonDailyIncom) {
        this.nonDailyIncom = nonDailyIncom;
    }

    public BigDecimal getNonDailyPay() {
        return nonDailyPay;
    }

    public void setNonDailyPay(BigDecimal nonDailyPay) {
        this.nonDailyPay = nonDailyPay;
    }

    public BigDecimal getAddProfit() {
        return addProfit;
    }

    public void setAddProfit(BigDecimal addProfit) {
        this.addProfit = addProfit;
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