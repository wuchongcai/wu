package com.hyxy.entity;

public class Role {
    private Integer roleid;

    private String rolername;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolername() {
        return rolername;
    }

    public void setRolername(String rolername) {
        this.rolername = rolername == null ? null : rolername.trim();
    }
}