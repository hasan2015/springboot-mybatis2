package hx.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hx.dao.TestDao;
import hx.model.User;

/**
 * Created by wangwei on 2016/9/2.
 */
@RestController
@RequestMapping({ "/home" })
public class UserController {
	@Autowired
	TestDao userMapper;

	@RequestMapping(value = "/user")
	@ResponseBody
	public String user() {
		User user = userMapper.findUserByName("裕祥");
		return user.getName() + "-----" + user.getAge();
	}
} 