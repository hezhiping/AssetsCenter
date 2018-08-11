package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FundChange {
    private Integer id;

    private Integer psnCode;

    private String currentMonth;

    private Date consumeDate;

    private String item;

    private BigDecimal money;

    private String profitLossSort;

    private String payMode;

    private BigDecimal payMoney;

    private String incomMode;

    private BigDecimal incomMoney;

    private Date createDate;

    private String tagStatus;

    private String currentYear;

    private String  profitLossSortName;
    
    public String getProfitLossSortName() {
		return profitLossSortName;
	}

	public void setProfitLossSortName(String profitLossSortName) {
		this.profitLossSortName = profitLossSortName;
	}

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

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProfitLossSort() {
        return profitLossSort;
    }

    public void setProfitLossSort(String profitLossSort) {
        this.profitLossSort = profitLossSort == null ? null : profitLossSort.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public String getIncomMode() {
        return incomMode;
    }

    public void setIncomMode(String incomMode) {
        this.incomMode = incomMode == null ? null : incomMode.trim();
    }

    public BigDecimal getIncomMoney() {
        return incomMoney;
    }

    public void setIncomMoney(BigDecimal incomMoney) {
        this.incomMoney = incomMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus == null ? null : tagStatus.trim();
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear == null ? null : currentYear.trim();
    }
}