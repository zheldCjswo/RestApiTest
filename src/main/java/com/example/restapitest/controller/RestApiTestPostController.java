package com.example.restapitest.controller;

import com.example.restapitest.dto.TestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class RestApiTestPostController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){

        requestData.entrySet().forEach(entry -> {
            System.out.println("key" + entry.getKey());
            System.out.println("key" + entry.getValue());
        });
    }

    @PostMapping("/post2")
    public void post2(@RequestBody TestDto testDto){
//
//        {
//            "id" : "aa",
//            "name" : "김돌",
//            "phone_number" : "010-5555-6666" 스네이크 -> 카멜로 받으려면
//        }
//           @JsonProperty("phone_number")
//           private String phoneNumber;

        System.out.println(testDto);
    }
}
