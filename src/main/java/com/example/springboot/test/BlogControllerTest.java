package com.example.springboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.example.springboot 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것은 X

@RestController
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }

}
