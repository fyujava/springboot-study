package com.taoche.study_5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model){

        model.addAttribute("hello","tester");
        return "/hello";
    }

}
