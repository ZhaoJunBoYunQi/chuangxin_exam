package com.mmall.service.impl;


import com.mmall.dao.AdminDao;
import com.mmall.pojo.Admin;
import com.mmall.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	public AdminDao adminDao;

	@Override
	public int insert(Admin record) {
		return adminDao.insert(record);
	}

	@Override
	public int insertSelective(Admin record) {
		return adminDao.insertSelective(record);
	}

	@Override
	public int update(Admin record) {
		return adminDao.update(record);
	}

	@Override
	public int delete(Integer id) {
		return adminDao.delete(id);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return adminDao.getTotal(map);
	}

	@Override
	public List<Admin> list(Map<String, Object> map) {
		return adminDao.list(map);
	}
}
