package com.bao.mybatis.mapper;

import java.util.List;

import com.bao.mybatis.model.User;

public interface UserMapper {

	public int insertUser(User user) throws Exception;
	
	public int updateUser(User user) throws Exception;
	
	public int deleteUser(Integer id) throws Exception;
	
	public User selectUserById(Integer id) throws Exception;
	
	public List<User> selectAllUser() throws Exception;
}
