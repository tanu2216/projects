package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.dto.FeedbackCommon;

public interface ICapstoreService {

	public List<FeedbackCommon> getAllFeedNRes();
	
	
	
	public FeedbackCommon search(String string);
	public void update(FeedbackCommon query);



	public String save(FeedbackCommon fc);



	
}
