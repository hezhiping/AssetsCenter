package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencyFund {
    private Integer id;

    private Integer psnCode;

    private String currentYear;

    private String currentMonth;

    private BigDecimal openingBalance;

    private BigDecimal periodIncom;

    private BigDecimal periodPay;

    private BigDecimal endingBalance;

    private String tagStatus;

    private Date createDate;

    private Integer costCode;

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

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear == null ? null : currentYear.trim();
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth == null ? null : currentMonth.trim();
    }

    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }

    public BigDecimal getPeriodIncom() {
        return periodIncom;
    }

    public void setPeriodIncom(BigDecimal periodIncom) {
        this.periodIncom = periodIncom;
    }

    public BigDecimal getPeriodPay() {
        return periodPay;
    }

    public void setPeriodPay(BigDecimal periodPay) {
        this.periodPay = periodPay;
    }

    public BigDecimal getEndingBalance() {
        return endingBalance;
    }

    public void setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
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

    public Integer getCostCode() {
        return costCode;
    }

    public void setCostCode(Integer costCode) {
        this.costCode = costCode;
    }
}