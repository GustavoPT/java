package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// TODO: Ajax test
// test relationships
// o to m
// m to m
// app
// heroku
//
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
