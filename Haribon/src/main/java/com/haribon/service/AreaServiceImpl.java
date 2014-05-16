package com.haribon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haribon.model.Area;
import com.haribon.repository.AreaDAO;

@Service
public class AreaServiceImpl implements AreaService  {
  
	@Autowired
    AreaDAO areaDAO;
	 
    @Override
	@Transactional
    public void persistArea(Area area) {
    	areaDAO.insertarArea(area);
    }

	
}
