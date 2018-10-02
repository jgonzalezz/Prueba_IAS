package com.test.ias.appaves.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ias.appaves.entity.Ave;
import com.test.ias.appaves.repository.IAveDao;

@Service
public class AveServiceImpl implements IAveService{

	
	@Autowired
	private IAveDao aveDao;
	
	
	@Override
	public List<Ave> findAll() {
		return (List<Ave>) aveDao.findAll();
	}


	@Override
	public Ave save(Ave ave) {
		return aveDao.save(ave);
	}


	@Override
	public void delete(String id) {
		aveDao.deleteById(id);
	}


	@Override
	public Ave findById(String id) {
		return aveDao.findById(id).orElse(null);
	}
	
	

}
