package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencyFund {
    private Integer id;

    private Integer psnCode;

    private Date currentMonthDate;

    private BigDecimal openingBalance;

    private BigDecimal periodIncom;

    private BigDecimal periodPay;

    private BigDecimal endingBalance;

    private String tagStatus;

    private Date createDate;

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

    public Date getCurrentMonthDate() {
        return currentMonthDate;
    }

    public void setCurrentMonthDate(Date currentMonthDate) {
        this.currentMonthDate = currentMonthDate;
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
}