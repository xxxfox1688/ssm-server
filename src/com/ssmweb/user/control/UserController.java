package com.ssmweb.user.control;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        /*logger.error("用户数据："+users);
        try {
        	System.out.println(users.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        return "home";
    }
    
    @RequestMapping(value="/web",method={RequestMethod.GET,RequestMethod.POST})
    public String head(Model model){
        return "frame/frame-ssm";
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
