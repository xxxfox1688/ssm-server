package com.ssmweb.common.menu.service;

import java.util.List;

import com.ssmweb.common.menu.pojo.Menu;

public interface IMenuService {
	public abstract List<Menu> getAllMenu();
	public abstract List<Menu> getAllParentMenu();
}
