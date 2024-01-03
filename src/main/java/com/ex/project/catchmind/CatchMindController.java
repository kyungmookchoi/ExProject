package com.ex.project.catchmind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("catchMind")
public class CatchMindController {

	@GetMapping("catchMindHome")
	public String catchMindHome ()throws Exception{
		return "catchMind/catchMindHome";
	}
	
}
