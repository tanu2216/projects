package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.FeedbackCommon;
@Service("capstoreService")
@Transactional
public class CapstoreServiceImpl implements ICapstoreService {

	@Autowired
	ICapstoreDao capstoreDao;

	@Override
	public String save(FeedbackCommon fc) {
		// TODO Auto-generated method stub
		return capstoreDao.save(fc);
	}


	

	
	@Override
	public List<FeedbackCommon> getAllFeedNRes() {
		// TODO Auto-generated method stub
		return capstoreDao.getAllFeedNRes();
	}

	
	
	
	
	@Override
	public FeedbackCommon search(String query_id) {
		// TODO Auto-generated method stub
		return capstoreDao.search(query_id);
	}

	@Override
	public void update(FeedbackCommon query) {
		// TODO Auto-generated method stub
		capstoreDao.update(query);
	}







}
