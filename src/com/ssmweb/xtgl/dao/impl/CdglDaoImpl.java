package com.ssmweb.xtgl.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssmweb.xtgl.dao.ICdglDao;

@Repository("cdglDao")
public class CdglDaoImpl extends SqlSessionDaoSupport implements ICdglDao {

	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
    
    

	@Override
	public String addMenu(Map map) {
		int i = this.getSqlSession().insert("addMenu", map);
		return i>0?"success":"failed";
	}
	

}
