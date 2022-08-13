package com.learn.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SpringSecurityApplicationTest {

    @GetMapping("/")
    public String home(){
        return ("<h1> Welcome home <h1/>");
    }
}




