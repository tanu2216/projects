package com.cg.capstore.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.FeedbackCommon;
import com.cg.capstore.service.ICapstoreService;


@Controller
public class CapstoreController {
	@Autowired
	ICapstoreService capstoreService;
	
	@RequestMapping("givefeedback")
	public String addfeed(@ModelAttribute("feed") FeedbackCommon fc){
		return "addfeed";
	}
	@RequestMapping(value="save",method=RequestMethod.POST)
	public ModelAndView insertFeed(@Valid @ModelAttribute("feed") FeedbackCommon fc,BindingResult result){
		String id="";
		id=capstoreService.save(fc);
		return new ModelAndView("index","fc",id);
	}
	
	
	
	
	
	
	@RequestMapping("getfeednres")
	public String showFeedList(Model model){
		List<FeedbackCommon> list = capstoreService.getAllFeedNRes();
		model.addAttribute("list",list);
		return "FeedNRes";
	}
	
	
	
	
	
	
	
	@RequestMapping("searchid")
	public String search(){
		return "searchquery";
		
	}
	@RequestMapping("searchquery1")
	public ModelAndView searchque(@ModelAttribute("my") FeedbackCommon que,Map<String, Object> model){
		FeedbackCommon q = capstoreService.search(que.getMerc_id());
		if(q == null ){
			return new ModelAndView("failure","queryid",q);
		}
		else{
			q.setMerc_id(que.getMerc_id());
		}
		return new ModelAndView("showsearch","temp",q);
		
	}
	@RequestMapping("update")
	public ModelAndView updatequery(@ModelAttribute("my") FeedbackCommon que){
		String id = que.getMerc_id();
		capstoreService.update(que);
		return new ModelAndView("UpdateSuccess","queryid",id);
	}

}
