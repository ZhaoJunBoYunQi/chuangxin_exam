package com.mmall.common.controller;

import com.mmall.pojo.Admin;
import com.mmall.pojo.PageBean;
import com.mmall.service.AdminService;
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

/**
 * Created by Administrator on 2018/4/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource
	private AdminService adminService;

	@RequestMapping("/admin/save")
	public String save(Admin admin, HttpServletResponse response) throws Exception {
		int resultTotal = 0;
		if (admin.getId() == null) {
			resultTotal = adminService.insert(admin);
		} else {
			resultTotal = adminService.update(admin);
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

	@RequestMapping("/admin/delete")
	public String delete(@RequestParam(value = "ids") String ids, HttpServletResponse response) throws Exception {
		String[] idStr = ids.split(",");
		for (int i = 0; i < idStr.length; i++) {
			adminService.delete(Integer.parseInt(idStr[i]));
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}

	@RequestMapping("admin/list")
	public String list(@RequestParam(value = "page", required = false) String page, @RequestParam(value = "rows", required = false) String rows, HttpServletResponse response) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Admin> blogTypeList = adminService.list(map);
		for (Admin list : blogTypeList) {
			System.out.print(list.getAdminId() + "  ");
		}
		Long total = adminService.getTotal(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(blogTypeList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}


}
