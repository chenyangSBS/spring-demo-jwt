package com.example.springdemo.controller;


import com.example.springdemo.dto.UserLoginDTO;
import com.example.springdemo.vo.UserInfoVONOAUTH;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
// for vue3 front-end request & response
public class UserController {


    @GetMapping("/info/{user}")
    ResponseEntity<UserInfoVONOAUTH> getResult(@PathVariable String user) {
        UserInfoVONOAUTH userInfoVO = new UserInfoVONOAUTH("1", user, "ada@sbs.com", "2023-11-05");
        return ResponseEntity.ok(userInfoVO);
    }

    @PostMapping("/login")
    ResponseEntity<UserInfoVONOAUTH> postResult(@RequestBody UserLoginDTO user) {
        UserInfoVONOAUTH userInfoVO = new UserInfoVONOAUTH("1", user.userName(), "ada@sbs.com", "2023-11-05");
        return ResponseEntity.ok(userInfoVO);
    }


}
