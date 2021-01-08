package com.sample.test.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sample.test.domain.User;

public interface UserMapper {
	@Select("select * from user where uid=#{uid}")
	public User getLonginInfo(@Param("uid") String uid) throws Exception;
}
