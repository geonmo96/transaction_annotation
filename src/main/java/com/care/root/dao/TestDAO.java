package com.care.root.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.care.root.dto.SystemDTO;
import com.care.root.dto.UserDTO;

@Repository
public interface TestDAO {
	@Insert("insert into user_info values(#{u})")
	public int userInsert(@Param("u") int num);
	@Insert("insert into system_info values(#{s})")
	public int systemInsert(@Param("s") int num);
	
	@Select("select * from user_info")
	public ArrayList<UserDTO> user_db_result();
	@Select("select * from system_info")
	public ArrayList<SystemDTO> sys_db_result();
}
