package com.mmall.dao;

import com.mmall.pojo.Admin;

import java.util.List;
import java.util.Map;

public interface AdminDao {
    int insert(Admin record);

    int insertSelective(Admin record);

    int update(Admin record);
    int delete(Integer id);

    public Long getTotal(Map<String,Object> map);

    public List<Admin> list(Map<String,Object> map);
}