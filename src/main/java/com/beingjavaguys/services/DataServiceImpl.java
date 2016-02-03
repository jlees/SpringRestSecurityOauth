package com.beingjavaguys.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beingjavaguys.models.User;
/**
 * @author Nagesh.Chauhan
 *
 */
@Service
public class DataServiceImpl implements DataService {

	@Override
	public List<User> getUserList() {
		
		// preparing user list with few hard coded values
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1, "user_1", "user_1@example.com", "9898989898"));
		userList.add(new User(2, "user_2", "user_2@example.com", "9767989898"));
		userList.add(new User(3, "user_3", "user_3@example.com", "9898459898"));
		
		return userList;
	}

}
