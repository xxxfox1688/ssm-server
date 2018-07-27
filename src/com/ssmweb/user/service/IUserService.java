package com.ssmweb.user.service;

import java.util.List;
import java.util.Map;

import com.ssmweb.user.pojo.User;

public interface IUserService {
	
	public abstract List<User> getAllUser();
	public abstract List<User> getUserByName(Map map);

}
