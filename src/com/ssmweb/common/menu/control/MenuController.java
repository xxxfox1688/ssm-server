package com.ssmweb.common.menu.control;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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
public class MenuController {
	private IMenuService menuService;
	private static Log logger = LogFactory.getLog(MenuController.class);
	    
		@ResponseBody
	    @RequestMapping(value="/menuxx",method={RequestMethod.GET,RequestMethod.POST})
	    public List<Menu> getAllMenu(){
	        List<Menu> menu = menuService.getAllMenu();
	        System.out.println("menu²Ëµ¥£º"+menu);
	        return menu;
	    }

		public IMenuService getMenuService() {
			return menuService;
		}

		@Resource
		public void setMenuService(IMenuService menuService) {
			this.menuService = menuService;
		}
	    
}
