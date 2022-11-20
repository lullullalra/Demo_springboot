package com.example.springboot.test;

import org.springframework.web.bind.annotation.*;

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest:";

    //localhost:8000/blog/http/lombok
    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m = Member.builder().username("pjh").password("1234").email("pjh@email.com").build();
        System.out.println(TAG+"getter:"+m.getId());
        m.setId(5000);
        System.out.println(TAG+"setter:"+m.getId());
        return "lombok test 완료";
    }

    //인터넷 브라우저 요청은 무조건 get요청 밖에 할 수 없다.
    //http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(Member member){


        return "get 요청"+member.getId()+","+member.getPassword()+","+member.getUsername()+","+member.getEmail();
    }

    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }


}
