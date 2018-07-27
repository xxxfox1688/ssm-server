package com.ssmweb.user.control;

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

import com.ssmweb.user.pojo.User;
import com.ssmweb.user.service.IUserService;

@Controller
public class UserController {
private IUserService userService;
private static Log logger = LogFactory.getLog(UserController.class);
    
    @RequestMapping(value="/home",method={RequestMethod.GET,RequestMethod.POST})
    public String home(Model model){
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "home";
    }
    
    @RequestMapping(value="/web",method={RequestMethod.GET,RequestMethod.POST})
    public String head(Model model){
        return "frame/frame-ssm";
    }
    @RequestMapping(value="/login",method={RequestMethod.GET,RequestMethod.POST})
    public String loginPage(Model model){
    	return "login/login";
    }
    
    @ResponseBody
    @RequestMapping(value="/signIn",method={RequestMethod.GET,RequestMethod.POST})
    public String signIn(HttpServletRequest request){
    	Map map = new HashMap();
    	String user_name = request.getParameter("user_name");
    	String user_pwd = request.getParameter("user_pwd");
    	map.put("user_name", user_name);
    	List<User> user = userService.getUserByName(map);
    	String result = "";
    	if (user.size()<=0) {
    		//用户信息不存在
    		result = "999998";
		} else {
			//000000验证用户信息成功，999999密码验证失败
			result = user.get(0).getUser_pwd().equals(user_pwd)?"000000":"999999";
		}
    	return result;
    }
    
    
    @RequestMapping(value="/test-body",method={RequestMethod.GET,RequestMethod.POST})
    public String testBody(Model model){
    	return "test/test-body";
    }
    
    public IUserService getUserService() {
    	return userService;
    }
    
    @Resource
    public void setUserService(IUserService userService) {
    	this.userService = userService;
    }
}
