package com.example.restapitest.controller;

import com.example.restapitest.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setName("kk");
        user.setAddress("address");
        return user;
    }
}
