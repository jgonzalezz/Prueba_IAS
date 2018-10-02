package com.test.ias.appaves.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ias.appaves.entity.Zona;
import com.test.ias.appaves.repository.IZonaDao;

@Service
public class ZonaServiceImpl implements IZonaService {
	
	@Autowired
	private IZonaDao zonaDao;

	@Override
	public List<Zona> findAll() {
		return (List<Zona>) zonaDao.findAll();
	}


}
