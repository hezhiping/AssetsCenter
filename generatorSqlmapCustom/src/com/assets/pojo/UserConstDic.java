package com.assets.pojo;

public class UserConstDic {
    private String category;

    private Long psnCode;

    private String costCode;

    private Integer id;

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
}