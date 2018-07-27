package com.assets.pojo;

import java.util.Date;

public class Person {
    private Integer psnCode;

    private String cname;

    private String fname;

    private String lname;

    private String gender;

    private String titleNo;

    private Long orgCode;

    private String orgEname;

    private String orgCname;

    private String posInOrg;

    private String dept;

    private String eaddress;

    private String caddress;

    private String tel;

    private String fax;

    private String email;

    private String http;

    private String highestDegree;

    private String tagStatus;

    private Date createDate;

    private Date updateTime;

    private String remark;

    public Integer getPsnCode() {
        return psnCode;
    }

    public void setPsnCode(Integer psnCode) {
        this.psnCode = psnCode;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getTitleNo() {
        return titleNo;
    }

    public void setTitleNo(String titleNo) {
        this.titleNo = titleNo == null ? null : titleNo.trim();
    }

    public Long getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(Long orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgEname() {
        return orgEname;
    }

    public void setOrgEname(String orgEname) {
        this.orgEname = orgEname == null ? null : orgEname.trim();
    }

    public String getOrgCname() {
        return orgCname;
    }

    public void setOrgCname(String orgCname) {
        this.orgCname = orgCname == null ? null : orgCname.trim();
    }

    public String getPosInOrg() {
        return posInOrg;
    }

    public void setPosInOrg(String posInOrg) {
        this.posInOrg = posInOrg == null ? null : posInOrg.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress == null ? null : eaddress.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http == null ? null : http.trim();
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree == null ? null : highestDegree.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}