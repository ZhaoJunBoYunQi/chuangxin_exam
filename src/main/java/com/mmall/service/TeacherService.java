package com.mmall.service;

import com.mmall.pojo.Teacher;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
public interface TeacherService {


	int insert(Teacher record);

	int deleteByPrimaryKey(Integer id);

	int updateByPrimaryKey(Teacher record);

	public Long getTotal(Map<String,Object> map);

	public List<Teacher> list(Map<String,Object> map);
}
