package com.zhkjoa.controller;

import com.zhkjoa.model.zhuser;
import com.zhkjoa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity zhLogin(HttpServletRequest request, @RequestBody zhuser zhu) {
        String truePwd=null;
        zhuser zhuser1=new zhuser();
        if(userService.searchByUsername(zhu.getZhUsername())!=null){
            zhuser1 = userService.searchByUsername(zhu.getZhUsername());
            truePwd = zhuser1.getZhPassword();
        }
        if (truePwd != null && truePwd.equals(zhu.getZhPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("zhname", zhuser1.getZhName());
            session.setAttribute("zhstate", zhuser1.getZhState());
            session.setAttribute("zhid", zhuser1.getZhId());
            session.setAttribute("zhdepartment", zhuser1.getZhDepartment());
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/loginstate", method = RequestMethod.POST)
    public ResponseEntity zhLoginstate(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("zhid") != null) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
