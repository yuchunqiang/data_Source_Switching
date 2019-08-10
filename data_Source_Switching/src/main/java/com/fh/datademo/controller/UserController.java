package com.fh.datademo.controller;

import com.fh.datademo.bean.TUser;
import com.fh.datademo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuchunqiang
 * @Title: UserController
 * @Package com.fh.datademo.controller
 * @Description: ${todo}
 * @date 2018/10/24  16:45
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("addUser")
    public String addUser(){
        //增加用户信息
        TUser user=new TUser();
        user.setName("尚峰");
        userService.addUser(user);
        return "success";
    }
}
