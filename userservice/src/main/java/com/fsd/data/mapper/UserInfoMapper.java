package com.fsd.data.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.fsd.data.entity.UserInfoDB;

@Mapper
@Repository

public interface UserInfoMapper {
    UserInfoDB selectUserByName(String uName);
    UserInfoDB selectByName(String uName);
    int addUser(UserInfoDB user);
    int updateValidate(String userName);
    int updateUserpass(String userName,String password);
    int deleteUser(int id);
}
