package smarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("hello");
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}

}
 