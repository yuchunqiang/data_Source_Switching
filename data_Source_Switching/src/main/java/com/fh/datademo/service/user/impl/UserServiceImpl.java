package com.fh.datademo.service.user.impl;

import com.fh.datademo.bean.TUser;
import com.fh.datademo.dao.UserDao;
import com.fh.datademo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuchunqiang
 * @Title: UserService
 * @Package com.fh.datademo.service.user.impl
 * @Description: ${todo}
 * @date 2018/10/24  15:58
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(TUser user) {
        userDao.addUser(user);
    }
}
