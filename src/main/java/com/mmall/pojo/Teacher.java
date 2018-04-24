package com.mmall.pojo;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Teacher {
	private Integer id;

	private String teaId;

	private String teaPwd;

	public Teacher(Integer id, String teaId, String teaPwd) {
		this.id = id;
		this.teaId = teaId;
		this.teaPwd = teaPwd;
	}

	public Teacher() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeaId() {
		return teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId == null ? null : teaId.trim();
	}

	public String getTeaPwd() {
		return teaPwd;
	}

	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd == null ? null : teaPwd.trim();
	}


}
