package com.assets.pojo;

public class ConstCategory {
    private String category;

    private String cdescription;

    private String edescription;

    private String querySql;

    private String remark;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription == null ? null : cdescription.trim();
    }

    public String getEdescription() {
        return edescription;
    }

    public void setEdescription(String edescription) {
        this.edescription = edescription == null ? null : edescription.trim();
    }

    public String getQuerySql() {
        return querySql;
    }

    public void setQuerySql(String querySql) {
        this.querySql = querySql == null ? null : querySql.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}