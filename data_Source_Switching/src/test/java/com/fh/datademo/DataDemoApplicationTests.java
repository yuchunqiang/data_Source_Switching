package com.fh.datademo;

import com.fh.datademo.bean.TUser;
import com.fh.datademo.service.user.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataDemoApplicationTests {

	@Autowired
	private IUserService userService;
	@Test
	public void contextLoads() {
		//增加用户信息
		TUser user=new TUser();
		user.setName("尚峰");
		userService.addUser(user);
	}

}
