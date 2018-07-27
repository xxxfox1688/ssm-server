package com.ssmweb.common.menu.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmweb.common.menu.pojo.Menu;
import com.ssmweb.common.menu.service.IMenuService;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
	private IMenuService menuService;
	private static Log logger = LogFactory.getLog(MenuController.class);

	@ResponseBody
	@RequestMapping(value = "/getAllMenu", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Menu> getAllMenu() {
		List<Menu> menu = menuService.getAllMenu();
		System.out.println("menu菜单：" + menu);
		return menu;
	}

	@ResponseBody
	@RequestMapping(value = "/getAllParentMenu", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Menu> getAllParentMenu() {
		List<Menu> menu = menuService.getAllParentMenu();
		System.out.println("主菜单：" + menu);
		return menu;
	}

	@RequestMapping(value = "/rightForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String getRightForm(HttpServletRequest request, Model model) {
		String right_form = request.getParameter("rightForm_name");
		return right_form;
	}

	@ResponseBody
	@RequestMapping(value = "/queryMenuInfo", method = { RequestMethod.POST })
	public List<Object> queryAreaInfo() {
		List<Menu> menu = menuService.getAllMenu();
		// 一级菜单
		List<Object> result = new ArrayList<>();
		for (Menu menuVO : menu) {
			Map<String, Object> map = new HashMap<>();
			if (menuVO.getCd_dj()==1) {
				map.put("text", menuVO.getMenu_name());
				map.put("id", menuVO.getId()+"");

				//二级菜单
				List<Object> cList = new ArrayList<>();
				for (Menu mVO : menu) {
					Map<String, Object> cMap = new HashMap<>();
					if (2==mVO.getCd_dj() && mVO.getSjcd_id() == menuVO.getId()) {
						cMap.put("text", mVO.getMenu_name());
						cMap.put("id", mVO.getId()+"");
						cList.add(cMap);
					}
				}

				map.put("nodes", cList);
				result.add(map);
			}
		}

		return result;
	}

	public IMenuService getMenuService() {
		return menuService;
	}

	@Resource
	public void setMenuService(IMenuService menuService) {
		this.menuService = menuService;
	}

}
