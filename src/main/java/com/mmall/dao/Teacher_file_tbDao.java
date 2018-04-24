package com.mmall.dao;

import com.mmall.pojo.Teacher_file_tb;

public interface Teacher_file_tbDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher_file_tb record);

    int insertSelective(Teacher_file_tb record);

    Teacher_file_tb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher_file_tb record);

    int updateByPrimaryKey(Teacher_file_tb record);
}