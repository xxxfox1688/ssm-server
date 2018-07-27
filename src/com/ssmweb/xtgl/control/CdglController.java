package com.ssmweb.xtgl.control;

import java.util.HashMap;
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

import com.ssmweb.xtgl.service.ICdglService;

@Controller
@RequestMapping(value="/cdgl")
public class CdglController {
private ICdglService cdglService;
private static Log logger = LogFactory.getLog(CdglController.class);
    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseBody
    @RequestMapping(value="/addMenu",method={RequestMethod.GET,RequestMethod.POST})
    public String addMenu(HttpServletRequest request){
		String menu_name = request.getParameter("menu_name");
		String menu_jc = request.getParameter("menu_jc");
		String menu_url = request.getParameter("menu_url");
		String yx_bz = request.getParameter("yx_bz");
		String xy_bz = request.getParameter("xy_bz");
		String cd_dj = request.getParameter("cd_dj");
		String sjcd_dj = request.getParameter("sjcd_dj");
		Map map = new HashMap();
		map.put("menu_name", menu_name);
		map.put("menu_jc", menu_jc);
		map.put("menu_url", menu_url);
		map.put("yx_bz", yx_bz);
		map.put("xy_bz", xy_bz);
		map.put("cd_dj", cd_dj);
		map.put("sjcd_dj", sjcd_dj);
		String result = "";
		result = cdglService.addMenu(map);
        return result;
    }

	public ICdglService getCdglService() {
		return cdglService;
	}

	@Resource
	public void setCdglService(ICdglService cdglService) {
		this.cdglService = cdglService;
	}
    
}
