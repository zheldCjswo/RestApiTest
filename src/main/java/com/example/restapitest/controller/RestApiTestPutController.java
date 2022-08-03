package com.example.restapitest.controller;

import com.example.restapitest.dto.PutDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/put")
public class RestApiTestPutController {

    @PutMapping("/put/{userId}")
    public PutDto put(@RequestBody PutDto putDto, @PathVariable Long userId){
        System.out.println("putDto = " + putDto);
        return putDto;
    }
//    {
//        "name":"kk",
//        "age" : 20,
//        "car_list" : [
//        {
//            "name" :"BMW",
//                "car_number" :"11A1234"
//        },
//        {
//            "name" :"K5",
//                "car_number" :"12A1234"
//        }
//        ]
//    }
}
