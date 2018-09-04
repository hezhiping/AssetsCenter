package com.assets.pojo;

import java.math.BigDecimal;

public class UserConstDic {
    private String category;

    private Long psnCode;

    private String costCode;

    private Integer id;

    private BigDecimal beginMoney;
    // 补充添加常数名称，用来页面显示
    private String costName;

    public String getCostName() {
		return costName;
	}

	public void setCostName(String costName) {
		this.costName = costName;
	}

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Long getPsnCode() {
        return psnCode;
    }

    public void setPsnCode(Long psnCode) {
        this.psnCode = psnCode;
    }

    public String getCostCode() {
        return costCode;
    }

    public void setCostCode(String costCode) {
        this.costCode = costCode == null ? null : costCode.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getBeginMoney() {
        return beginMoney;
    }

    public void setBeginMoney(BigDecimal beginMoney) {
        this.beginMoney = beginMoney;
    }
}