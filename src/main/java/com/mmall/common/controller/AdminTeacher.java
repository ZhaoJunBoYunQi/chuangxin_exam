package com.mmall.common.controller;

import com.mmall.pojo.PageBean;
import com.mmall.pojo.Teacher;
import com.mmall.service.TeacherService;
import com.mmall.util.ResponseUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by Administrator on 2018/4/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminTeacher {
	@Resource
	private TeacherService teacherService;

	@RequestMapping("/teacher/save")
	public String save(Teacher teacher, HttpServletResponse response) throws Exception {
		int resultTotal = 0;
		if (teacher.getId() == null) {
			resultTotal = teacherService.insert(teacher);
		} else {
			resultTotal = teacherService.updateByPrimaryKey(teacher);
		}
		JSONObject result = new JSONObject();
		if (resultTotal > 0) {
			result.put("success", true);
		} else {
			result.put("success", false);
		}

		ResponseUtil.write(response, result);

		return null;
	}

	@RequestMapping("/teacher/delete")
	public String delete(@RequestParam(value = "ids") String ids, HttpServletResponse response) throws Exception {
		String[] idStr = ids.split(",");
		for (int i = 0; i < idStr.length; i++) {
			teacherService.deleteByPrimaryKey(Integer.parseInt(idStr[i]));
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);

		return null;
	}

	@RequestMapping("teacher/list")
	public String list(@RequestParam(value = "page", required = false) String page, @RequestParam(value = "rows", required = false) String rows, HttpServletResponse response) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Teacher> blogTypeList = teacherService.list(map);
		for(Teacher teacher:blogTypeList){
			System.out.println(teacher.getTeaId());
		}
		Long total = teacherService.getTotal(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(blogTypeList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
}
