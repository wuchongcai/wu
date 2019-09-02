package com.hyxy.entity;

public class Admin {
    private Integer id;

    private String adminname;

    private Integer adminNumber;

    private String password;

    private Integer roleid;
    
    private Role role;

    
    
    
    
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Integer getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(Integer adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}