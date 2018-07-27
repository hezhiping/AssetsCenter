package com.assets.pojo;

public class SysRole {
    private Short roleId;

    private String name;

    private Short parentId;

    private String description;

    private Short state;

    private Short type;

    private String manageRoles;

    private String className;

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getManageRoles() {
        return manageRoles;
    }

    public void setManageRoles(String manageRoles) {
        this.manageRoles = manageRoles == null ? null : manageRoles.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}