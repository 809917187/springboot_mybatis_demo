package com.zw.springbootDemo01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.zw.springbootDemo01.entity.User;

@Repository
public interface UserMapper {
	
	List<User> getAllUsers();
}
