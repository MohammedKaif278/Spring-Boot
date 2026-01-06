package com.instamart.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instamart.dao.InstamartRepo;
import com.instamart.model.Instamart;
import com.instamart.service.InstamartService;

@Service
public class InstamaartServiceImpl implements InstamartService{

	@Autowired
	private InstamartRepo instamartRepo;
	
	@Override
	public void createOrder(Instamart instamart) {
		instamartRepo.save(instamart);
		
	}

	@Override
	public List<Instamart> getAllOrder() {
		return instamartRepo.findAll();
		 
	}

	@Override
	public Instamart getOrderById(Long id) {
		
		return instamartRepo.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		instamartRepo.deleteById(id);
		
	}

}
