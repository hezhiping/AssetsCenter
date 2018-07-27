package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PersonalLoan {
    private Integer id;

    private Integer psnCode;

    private Date currentMonthDate;

    private String lendPerson;

    private Date lendDate;

    private BigDecimal lendMoney;

    private BigDecimal accumulateProfit;

    private String going;

    private Date createDate;

    private String tagStatus;

    private String remark;

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

    public String getLendPerson() {
        return lendPerson;
    }

    public void setLendPerson(String lendPerson) {
        this.lendPerson = lendPerson == null ? null : lendPerson.trim();
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public BigDecimal getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(BigDecimal lendMoney) {
        this.lendMoney = lendMoney;
    }

    public BigDecimal getAccumulateProfit() {
        return accumulateProfit;
    }

    public void setAccumulateProfit(BigDecimal accumulateProfit) {
        this.accumulateProfit = accumulateProfit;
    }

    public String getGoing() {
        return going;
    }

    public void setGoing(String going) {
        this.going = going == null ? null : going.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}