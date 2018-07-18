package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class InvestBank {
    private Integer id;

    private Integer psnCode;

    private Integer investCode;

    private Date currentMonthDate;

    private String investName;

    private Date investDate;

    private String investType;

    private BigDecimal investMoney;

    private BigDecimal investProfit;

    private Date investProfitDate;

    private String annualizedRateReturn;

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

    public Integer getInvestCode() {
        return investCode;
    }

    public void setInvestCode(Integer investCode) {
        this.investCode = investCode;
    }

    public Date getCurrentMonthDate() {
        return currentMonthDate;
    }

    public void setCurrentMonthDate(Date currentMonthDate) {
        this.currentMonthDate = currentMonthDate;
    }

    public String getInvestName() {
        return investName;
    }

    public void setInvestName(String investName) {
        this.investName = investName == null ? null : investName.trim();
    }

    public Date getInvestDate() {
        return investDate;
    }

    public void setInvestDate(Date investDate) {
        this.investDate = investDate;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType == null ? null : investType.trim();
    }

    public BigDecimal getInvestMoney() {
        return investMoney;
    }

    public void setInvestMoney(BigDecimal investMoney) {
        this.investMoney = investMoney;
    }

    public BigDecimal getInvestProfit() {
        return investProfit;
    }

    public void setInvestProfit(BigDecimal investProfit) {
        this.investProfit = investProfit;
    }

    public Date getInvestProfitDate() {
        return investProfitDate;
    }

    public void setInvestProfitDate(Date investProfitDate) {
        this.investProfitDate = investProfitDate;
    }

    public String getAnnualizedRateReturn() {
        return annualizedRateReturn;
    }

    public void setAnnualizedRateReturn(String annualizedRateReturn) {
        this.annualizedRateReturn = annualizedRateReturn == null ? null : annualizedRateReturn.trim();
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