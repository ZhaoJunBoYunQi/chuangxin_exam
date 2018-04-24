package com.mmall.service.impl;

import com.mmall.dao.TeacherDao;
import com.mmall.pojo.Teacher;
import com.mmall.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

	@Resource
	private TeacherDao teacherDao;

	@Override
	public int insert(Teacher record) {
		return teacherDao.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return teacherDao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Teacher record) {
		return teacherDao.updateByPrimaryKey(record);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return teacherDao.getTotal(map);
	}

	@Override
	public List<Teacher> list(Map<String, Object> map) {
		return teacherDao.list(map);
	}
}
