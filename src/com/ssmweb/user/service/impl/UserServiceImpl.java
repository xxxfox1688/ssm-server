package com.ssmweb.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssmweb.user.dao.IUserDao;
import com.ssmweb.user.pojo.User;
import com.ssmweb.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;
	
	@Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userDao.getAllUser();
    }

	public IUserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
