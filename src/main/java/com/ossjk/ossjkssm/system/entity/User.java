package com.ossjk.ossjkssm.system.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ossjk.core.base.entity.BaseEntity;

public class User extends BaseEntity {

	private Integer rid;

	private Integer ogid;

	private String username;

	private String pwd;

	private BigDecimal sex;

	private String birth;

	private String phone;

	private String email;

	private Date logintime;

	private String loginip;

/*	这种映射要在用到的数据库数据没有多表同名的情况下才能够正常使用
	private Organization organization;
	private Role role;*/

	private String organizationName;
	private String roleName;

	private String mdby;

    public String getMdby() {
        return mdby;
    }

    public void setMdby(String mdby) {
        this.mdby = mdby;
    }

    public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getOgid() {
		return ogid;
	}

	public void setOgid(Integer ogid) {
		this.ogid = ogid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public BigDecimal getSex() {
		return sex;
	}

	public void setSex(BigDecimal sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth == null ? null : birth.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getLoginip() {
		return loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip == null ? null : loginip.trim();
	}

}