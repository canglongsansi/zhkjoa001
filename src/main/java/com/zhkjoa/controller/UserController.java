package com.zhkjoa.controller;

import com.zhkjoa.model.zhuser;
import com.zhkjoa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/queryall")
    public ResponseEntity userQueryAll(){
        List<zhuser> zhusers = userService.userQueryAll();
        return new ResponseEntity(zhusers,HttpStatus.OK);
    }
}
