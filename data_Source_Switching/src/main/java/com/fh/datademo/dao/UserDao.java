package com.fh.datademo.dao;

import com.fh.datademo.bean.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuchunqiang
 * @Title: UserDao
 * @Package com.fh.datademo.dao
 * @Description: ${todo}
 * @date 2018/10/24  16:16
 */
@Mapper
@Repository
public interface UserDao {

    public List<TUser> queryUser();

    public void addUser(TUser user);
}
