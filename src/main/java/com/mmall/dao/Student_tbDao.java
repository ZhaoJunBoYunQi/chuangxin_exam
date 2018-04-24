package com.mmall.dao;

import com.mmall.pojo.Student_tb;

public interface Student_tbDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Student_tb record);

    int insertSelective(Student_tb record);

    Student_tb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student_tb record);

    int updateByPrimaryKey(Student_tb record);
}