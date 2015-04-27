package com.markwar.action;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.markwar.model.User;
import com.markwar.service.UserService;

@Controller
@RequestMapping("/welcome")
public class UserAction {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/create")
	public String create(Model model) {
		User user = new User();
		user.setAge(12);
		user.setName("mark");
		user.setPassword("hello");
		user.setUserId(2L);
		userService.createUser(user);
		model.addAttribute("message", "添加用户成功");
		return "hello";
	}
	
	@RequestMapping("/find")
	public String find(Model model) {
		User user = new User();
		user = userService.findByUserId(1L);
		model.addAttribute("message", user.getName());
		return "hello";
	}
	
	@RequestMapping("/loadall")
	public String loadall(Model model) {
		
		List<User> list = userService.findAll();
		
		model.addAttribute("message", list.get(0).getName());
		return "hello";
	}
}
