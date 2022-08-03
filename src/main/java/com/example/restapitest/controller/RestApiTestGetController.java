package com.example.restapitest.controller;

import com.example.restapitest.dto.TestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class RestApiTestGetController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/{message}")
    public String hello(@PathVariable String message) {
        return message;
    }

    @GetMapping("/hello2/{message}")
    public String hello2(@PathVariable(name = "message") String message2) {
        return message2;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam Map<String, String> map) {

        String result = "";
        for (String key : map.keySet()) {
            result += map.get(key);
            System.out.println(map.get(key));
        }

        return result;
    }

    @GetMapping("/hello4")
    public String hello4(TestDto testDto) {
        return testDto.toString();
    }
}

