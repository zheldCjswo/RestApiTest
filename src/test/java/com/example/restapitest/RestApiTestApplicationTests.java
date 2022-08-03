package com.example.restapitest;

import com.example.restapitest.dto.UserObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("-----------------------");
        System.out.println("test");

        //Text Json -> Object
        //Object -> Json

        var objectMapper = new ObjectMapper();

        var user = new UserObjectMapper("dd",10);

        String text = null;
        
        //Object 변환 시 getter 메서드 활용함
        try {
            text = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("text = " + text);

        UserObjectMapper objectUser = null;
        try {
            objectUser = objectMapper.readValue(text, UserObjectMapper.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("objectUser = " + objectUser);

    }

}
