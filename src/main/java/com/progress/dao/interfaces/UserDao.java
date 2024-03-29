package com.progress.dao.interfaces;

import java.util.List;

import com.progress.jpa.Users;

/**
 * 
 * @author mgarimid
 *
 */
public interface UserDao {
	public Users getUserByUserName(String userName);

	public Users getUserByUserID(int userID);

	public List<String> getAuthoritiesByUserName(String userName);

	public List<Users> getAll();

	public void addLogin(Users user);
	
	public void updateUser(Users user);

}