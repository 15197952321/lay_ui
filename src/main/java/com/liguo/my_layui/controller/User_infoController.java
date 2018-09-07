package com.liguo.my_layui.controller;

import com.liguo.my_layui.model.User_info;
import com.liguo.my_layui.model.resultUi.TableResult;
import com.liguo.my_layui.service.User_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class User_infoController {

    @Autowired
    private User_infoService user_infoService;

    @RequestMapping("/userlist")
    @ResponseBody
    public TableResult<User_info> listUserInfo(){
        TableResult<User_info> result = new TableResult<>();
        result.setCode(0);
        result.setCount(2);
        result.setData(user_infoService.listUserInfo());

        return result;
    }

}
