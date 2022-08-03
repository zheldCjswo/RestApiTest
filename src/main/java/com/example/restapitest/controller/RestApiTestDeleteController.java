package com.example.restapitest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete")
public class RestApiTestDeleteController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String accout){
        System.out.println("userId = " + userId);
        System.out.println("accout = " + accout);
    }

}
