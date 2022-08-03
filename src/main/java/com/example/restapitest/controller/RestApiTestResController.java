package com.example.restapitest.controller;

import com.example.restapitest.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/res")
public class RestApiTestResController {

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

//    {
//        "name" : "kk",
//        "age" : 10,
//        "phoneNumber" : "000-111-2222",
//        "address" : "jangwon"
//    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
