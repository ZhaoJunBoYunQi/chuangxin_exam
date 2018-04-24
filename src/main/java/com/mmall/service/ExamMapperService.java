package com.mmall.service;

import com.mmall.pojo.Exam;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
public interface ExamMapperService {


	int insert(Exam Exam);

	int update(Exam Exam);

	int deleteByPrimaryKey(Integer id);

	public Long getTotal(Map<String,Object> map);

	public List<Exam> list(Map<String,Object> map);



}
