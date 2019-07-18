package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Fake;
import com.example.demo.Repository.TruthRepo;



@Controller
public class TruthController {
	
	@Autowired
	TruthRepo tr;
	
	@RequestMapping("/")
	String index( HttpServletRequest request)
	{
		Fake fake=tr.findByScore();
		
	//	System.out.println("value is "+fake.getFollowbyfollower());
		request.setAttribute("fake", fake);
		return "index";
	}
	
	@RequestMapping("/update")
	String update(HttpServletRequest request,@RequestParam("score") String score,@RequestParam("impac") String impac,@RequestParam("id") String id)
	{
		System.out.print("id is "+ id+"score is "+score);
	   Fake f1=tr.findById(Integer.parseInt(id));
	   tr.setFakeInfoById(Integer.parseInt(score),Integer.parseInt(impac),Integer.parseInt(id));
         Fake fake=tr.findByScore();
		System.out.println("value is "+fake.getFollowbyfollower());
		request.setAttribute("fake", fake);
		return "index";
	}

}
