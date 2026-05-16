package com.vishal.SpringBootRestApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Welcome";
    }
    @RequestMapping("/about")
    public String about(){
        return "We Don't Teach, We Educate";
    }
}
