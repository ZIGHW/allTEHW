package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	
	@RequestMapping("/actorList")
	public String showSearchActorForm(HttpServletRequest request) {
		System.out.println(request.getParameter("name"));
		request.setAttribute("actors", actorDao.getMatchingActors(request.getParameter("name")));
		return "actorList";
	}

//	/* What about here? */
//	public String searchActors(/* What arguments go here to get parameters from the page? */) {
//		/* Call the model and pass values to the jsp */
//		return null;
//	}
}

//@RequestMapping("/alienTravelInput")
//public String displayAlienTravelInputPage() {
//	return "alienTravelInput";
//}
