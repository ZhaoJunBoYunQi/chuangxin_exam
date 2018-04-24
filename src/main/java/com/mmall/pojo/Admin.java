package com.mmall.pojo;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Admin { private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;

	}

	private String adminId;

	private String adminPwd;

	public Admin(String adminId, String adminPwd) {
		this.adminId = adminId;
		this.adminPwd = adminPwd;
	}

	public Admin() {
		super();
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId == null ? null : adminId.trim();
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd == null ? null : adminPwd.trim();
	}
}
