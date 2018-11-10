package com.zhkjoa.service;

import com.zhkjoa.mapper.zhuserMapper;
import com.zhkjoa.model.zhuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private zhuserMapper zdao;
    public List<zhuser> userQueryAll(){
        return zdao.queryAll();
    }
    public zhuser searchByUsername(String username){
        return zdao.selectByUsername(username);
    }
}
