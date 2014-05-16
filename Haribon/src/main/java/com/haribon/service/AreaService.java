package com.haribon.service;

import org.springframework.transaction.annotation.Transactional;

import com.haribon.model.Area;

public interface AreaService {

	public abstract void persistArea(Area area);

}