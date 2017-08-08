package wengzd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wengzd.dao.UserMapper;
import wengzd.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper user;
	
	public User selectByPrimaryKey(Integer id)
	{
		return user.selectByPrimaryKey(id);
	}
}
