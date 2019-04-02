package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.FeedbackCommon;

public interface ICapstoreDao {

	public List<FeedbackCommon> getAllFeedNRes();
	
	
	
	public FeedbackCommon search(String query_id);
	public void update(FeedbackCommon query);




	public String save(FeedbackCommon fc);




	

}
