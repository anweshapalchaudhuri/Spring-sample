package com.poc.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.bean.UserBean;

@Controller
public class MainController {
	
	@RequestMapping(value="displayForm", method=RequestMethod.GET)
    public String helloWorld(UserBean ud) {
        return "loginPage";            
    }

	        @RequestMapping("/login")
	        public String loginCheck(@Valid UserBean userBean, BindingResult result, ModelMap model) {
	            if (result.hasErrors()) {
	                return "loginPage";
	            } else {
	                model.addAttribute("lfobj", userBean);
	                return "success";
	            }
	        }
	 
	}
