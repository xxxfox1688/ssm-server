package com.ssmweb.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ssmweb.user.pojo.User;
import com.ssmweb.user.service.IUserService;  
  
  
public class TestWeb {  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        List<User> user = userService.getAllUser();
         System.out.println(user);  
        // logger.info("Öµ£º"+user.getUserName());  
    }  
}  