package com.tcs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	String message = "Welcome";
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Skyguide") String name) {
		System.out.println("in controller");//Invalid comment to be removed
 
		ModelAndView mv = new ModelAndView("dummyworld");//Invalid to be deleted
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
