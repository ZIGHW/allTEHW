package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@SessionAttributes("faves")

public class HelloController {

	@RequestMapping("/color")
	public String askColor() {
		return "color";
	}
	
	@RequestMapping(path="/food", method=RequestMethod.POST)
	public String askFood(ModelMap map, @RequestParam String color) {
		Faves faves = new Faves();
		faves.setColor(color);
		map.put("faves", faves);
		return "food";
	}
	
	@RequestMapping(path="/season", method=RequestMethod.POST)
	public String askSeason(ModelMap map, @RequestParam String food) {
		Faves faves = (Faves) map.get("faves");
		faves.setFood(food);
		map.put("faves", faves);
		return "season";
	}
	
	
	@RequestMapping(path="/present", method=RequestMethod.POST)
	public String showResult(ModelMap map, @RequestParam String season ) {
		Faves faves = (Faves) map.get("faves");
		faves.setSeason(season);
		map.put("faves", faves);
		return "present";
	}
}
