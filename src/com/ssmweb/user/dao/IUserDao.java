package com.ssmweb.user.dao;

import java.util.List;
import java.util.Map;

import com.ssmweb.user.pojo.User;

public interface IUserDao {
	
	public abstract List<User> getAllUser();
	public abstract List<User> getUserByName(Map map);

}
