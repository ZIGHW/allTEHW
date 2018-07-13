package com.techelevator;

import com.techelevator.dao.CustomerDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customerList")
    public String showFilmSearchForm() {
        return "customerList";
    }
    
    @RequestMapping("/customerListResults")
    public String searchCustomers(HttpServletRequest request) {
    	request.setAttribute("customers", customerDao.searchAndSortCustomers(request.getParameter("search"), request.getParameter("sort")));
    	return "customerList";
    }
//    	System.out.println(request.getParameter("genre"));
//    	System.out.println(request.getParameter("maxLen"));
//    	System.out.println(request.getParameter("minLen"));
//    	System.out.println(filmDao.getFilmsBetween(request.getParameter("genre"), Integer.parseInt(request.getParameter("minLen")), Integer.parseInt(request.getParameter("maxLen"))).size());
//    	request.setAttribute("films", filmDao.getFilmsBetween(request.getParameter("genre"), Integer.parseInt(request.getParameter("minLen")), Integer.parseInt(request.getParameter("maxLen"))));
//    	
//        return "filmList";
    
    
}