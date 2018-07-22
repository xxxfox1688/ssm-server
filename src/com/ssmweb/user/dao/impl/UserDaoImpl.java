package com.ssmweb.user.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssmweb.user.dao.IUserDao;
import com.ssmweb.user.pojo.User;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
    
    

	@Override
	public List<User> getAllUser() {
		List<User> users = this.getSqlSession().selectList("getAllUser");
		return users;
	}
	

}
