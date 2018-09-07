package com.liguo.my_layui.service;

import com.liguo.my_layui.mapper.User_infoMapper;
import com.liguo.my_layui.model.User_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_infoService {

    @Autowired
    private User_infoMapper user_infoMapper;

    public List<User_info> listUserInfo(){
        return user_infoMapper.selectByExample(null);
    }

}
