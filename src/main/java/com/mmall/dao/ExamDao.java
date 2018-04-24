package com.mmall.dao;

import com.mmall.pojo.Exam;

import java.util.List;
import java.util.Map;

public interface ExamDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKeyWithBLOBs(Exam record);

    int updateByPrimaryKey(Exam record);

    public Long getTotal(Map<String,Object> map);

    public List<Exam> list(Map<String,Object> map);





}