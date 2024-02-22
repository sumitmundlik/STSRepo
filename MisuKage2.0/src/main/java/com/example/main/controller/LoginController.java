package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.main.Repository.UserRepository;
import com.example.main.model.User;


@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    
    @RequestMapping(value = "/index")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model m) {
    	m.addAttribute("name", name);
    	return "index";
    }

    
}
