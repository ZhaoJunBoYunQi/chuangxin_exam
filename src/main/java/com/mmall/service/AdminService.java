package com.mmall.service;

import com.mmall.pojo.Admin;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
public interface AdminService {
	public int insert(Admin record);

	public int insertSelective(Admin record);

	public int update(Admin record);

	public int delete(Integer id);

	public Long getTotal(Map<String,Object> map);

	public List<Admin> list(Map<String,Object> map);
}
