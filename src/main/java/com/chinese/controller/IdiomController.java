package com.chinese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdiomController {

    @GetMapping("/idiom")
    public String idiomPage(){
        System.out.println("成语");
        return "idiom";
    }
}
