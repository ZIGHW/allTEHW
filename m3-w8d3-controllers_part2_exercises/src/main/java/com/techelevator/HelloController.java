package com.techelevator;

import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.JdbcReviewDao;
import com.techelevator.model.Review;



@Controller 
public class HelloController {

	@Autowired
	JdbcReviewDao reviewDao;
	
	
	@RequestMapping("/submitReview")
	public String displayGreeting() {
		
		return "submitReview";
	}
	
	@RequestMapping(path="/reviews", method=RequestMethod.POST)
	public String proessReviews(Review review, HttpServletRequest request) {
		review.setDateSubmitted((LocalDateTime.now()));
		reviewDao.save(review);
		return "redirect:/reviewDisplay";
	}
	
	@RequestMapping(path="/reviewDisplay")
	public String showReviews( HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());
		return "reviews";
	}
	
	
//	@RequestMapping(path="/viewPosts", method=RequestMethod.POST)
//	public String addViewPosts(ForumPost post, HttpServletRequest request) {
//
//		post.setDatePosted(LocalDateTime.now());
//		
//		forumDao.save(post);
//		
//		
//		request.setAttribute("postHistory", forumDao.getAllPosts());	
//		return "viewPosts";
//	}	
}
