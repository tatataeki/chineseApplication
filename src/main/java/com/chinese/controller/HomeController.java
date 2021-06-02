package com.chinese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String Home(Model model){
        model.addAttribute("test","test");
        System.out.println("hello springboot!!");
        return "home";
    }
}
