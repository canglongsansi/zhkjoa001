package com.zhkjoa.service;

import com.zhkjoa.mapper.zhmessageMapper;
import com.zhkjoa.model.zhmessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private zhmessageMapper zhmsgMapper;
    public void zhMsgAdd(zhmessage msg){
        zhmsgMapper.insert(msg);
    }
}
