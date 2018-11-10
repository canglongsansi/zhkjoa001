package com.zhkjoa.controller;

import com.zhkjoa.model.zhmessage;
import com.zhkjoa.service.MessageService;
import com.zhkjoa.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/message",method = RequestMethod.POST)
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private DateUtil dateUtil;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity msgAdd(HttpServletRequest request, @RequestParam(value = "title", required = false) String title, @RequestParam(value = "msgdata", required = false) String msgdata){
        zhmessage zmsg=new zhmessage();
        HttpSession session = request.getSession();
        zmsg.setmName((String)session.getAttribute("zhname"));
        zmsg.setmTitle(title);
        zmsg.setmData(msgdata);
        zmsg.setmTime(dateUtil.getTime());
        zmsg.setmDepartment((String)session.getAttribute("zhdepartment"));
        zmsg.setmState(1);
        messageService.zhMsgAdd(zmsg);
        return new ResponseEntity(HttpStatus.OK);
    }
}
