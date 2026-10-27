package com.lhs.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Every One";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am a Devloper 🧑🏾‍💻" ;
    }

}
