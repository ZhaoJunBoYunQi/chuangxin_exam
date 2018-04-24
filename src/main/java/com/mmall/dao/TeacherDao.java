package com.mmall.dao;

import com.mmall.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

     Long getTotal(Map<String,Object> map);

     List<Teacher> list(Map<String,Object> map);
}