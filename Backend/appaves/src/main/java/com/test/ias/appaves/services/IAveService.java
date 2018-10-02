package com.test.ias.appaves.services;

import java.util.List;

import com.test.ias.appaves.entity.Ave;

public interface IAveService {
	
	public List<Ave> findAll();
	
	public Ave save(Ave ave);
	
	public void delete(String id);
	
	public Ave findById (String id);

}
