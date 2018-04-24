package com.mmall.service.impl;

import com.mmall.dao.ExamDao;
import com.mmall.pojo.Exam;
import com.mmall.service.ExamMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/22.
 */
@Service("")
public class ExamMapperServiceImpl  implements ExamMapperService{

	@Resource
	private ExamDao examDao;
	@Override
	public int insert(Exam Exam) {
		return examDao.insert(Exam);
	}

	@Override
	public int update(Exam Exam) {
		return examDao.updateByPrimaryKey(Exam);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return examDao.deleteByPrimaryKey(id);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return examDao.getTotal(map);
	}

	@Override
	public List<Exam> list(Map<String, Object> map) {
		return examDao.list(map);
	}
}
