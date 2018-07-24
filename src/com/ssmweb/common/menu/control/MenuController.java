package com.ssmweb.common.menu.control;

import java.util.List;

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
@RequestMapping(value="/menu")
public class MenuController {
	private IMenuService menuService;
	private static Log logger = LogFactory.getLog(MenuController.class);
	    
		@ResponseBody
	    @RequestMapping(value="/getAllMenu",method={RequestMethod.GET,RequestMethod.POST})
	    public List<Menu> getAllMenu(){
	        List<Menu> menu = menuService.getAllMenu();
	        System.out.println("menu菜单："+menu);
	        return menu;
	    }
		@ResponseBody
		@RequestMapping(value="/getAllParentMenu",method={RequestMethod.GET,RequestMethod.POST})
		public List<Menu> getAllParentMenu(){
			List<Menu> menu = menuService.getAllParentMenu();
			System.out.println("上级菜单："+menu);
			return menu;
		}
		
		@RequestMapping(value="/rightForm",method={RequestMethod.GET,RequestMethod.POST})
	    public String getRightForm(HttpServletRequest request,Model model){
	        String right_form = request.getParameter("rightForm_name");
	        return right_form;
	    }

		public IMenuService getMenuService() {
			return menuService;
		}

		@Resource
		public void setMenuService(IMenuService menuService) {
			this.menuService = menuService;
		}
	    
}
