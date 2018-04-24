package com.mmall.dao;

import com.mmall.pojo.Student_file_tb;

public interface Student_file_tbDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Student_file_tb record);

    int insertSelective(Student_file_tb record);

    Student_file_tb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student_file_tb record);

    int updateByPrimaryKey(Student_file_tb record);
}