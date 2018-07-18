package com.assets.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PayCollection {
    private Integer id;

    private Integer psnCode;

    private Date currentMonthDate;

    private String receiptItem;

    private Date receiptDate;

    private String person;

    private BigDecimal receiptPay;

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

    public String getReceiptItem() {
        return receiptItem;
    }

    public void setReceiptItem(String receiptItem) {
        this.receiptItem = receiptItem == null ? null : receiptItem.trim();
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public BigDecimal getReceiptPay() {
        return receiptPay;
    }

    public void setReceiptPay(BigDecimal receiptPay) {
        this.receiptPay = receiptPay;
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