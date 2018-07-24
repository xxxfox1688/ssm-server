package com.ssmweb.common.menu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssmweb.common.menu.dao.IMenuDao;
import com.ssmweb.common.menu.pojo.Menu;

@Repository("menuDao")
public class MenuDaoImpl  extends SqlSessionDaoSupport implements IMenuDao{

	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
    
    

	@Override
	public List<Menu> getAllMenu() {
		List<Menu> users = this.getSqlSession().selectList("getAllMenu");
		return users;
	}
	@Override
	public List<Menu> getAllParentMenu() {
		List<Menu> users = this.getSqlSession().selectList("getAllParentMenu");
		return users;
	}
}
