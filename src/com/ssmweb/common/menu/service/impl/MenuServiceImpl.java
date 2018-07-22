package com.ssmweb.common.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmweb.common.menu.dao.IMenuDao;
import com.ssmweb.common.menu.pojo.Menu;
import com.ssmweb.common.menu.service.IMenuService;

@Service("menuService")
public class MenuServiceImpl implements IMenuService {
	private IMenuDao menuDao;
	@Override
	public List<Menu> getAllMenu() {
        return menuDao.getAllMenu();
    }

	public IMenuDao getMenuDao() {
		return menuDao;
	}

	@Resource
	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
}
