package com.ssmweb.xtgl.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssmweb.xtgl.dao.ICdglDao;
import com.ssmweb.xtgl.service.ICdglService;

@Service("cdglService")
public class CdglServiceImpl implements ICdglService {
	
	private ICdglDao cdglDao;
	
	@Override
    public String addMenu(Map map) {
        // TODO Auto-generated method stub
        return cdglDao.addMenu(map);
    }

	public ICdglDao getCdglDao() {
		return cdglDao;
	}
	@Resource
	public void setCdglDao(ICdglDao cdglDao) {
		this.cdglDao = cdglDao;
	}
}
