package com.example.BloodBank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControl {
 @RequestMapping(/home)
	public String home() {
	 return "home";
 }
}
