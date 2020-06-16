package com.fsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.data.entity.Login.LoginEntity;
import com.fsd.data.entity.Login.LoginReturn;
import com.fsd.data.entity.UserInfoDB;
import com.fsd.data.mapper.UserInfoMapper;
import com.fsd.tools.TokenTool;

@RestController
@CrossOrigin("*")

public class LoginController {
    private final UserInfoMapper userMapper;

    @Autowired
    private LoginController(UserInfoMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("login")
//    public LoginReturn authUnamePwd(@RequestBody(required = true) LoginEntity authUser) {
        public LoginReturn authUnamePwd(@RequestBody(required = true) LoginEntity authUser) {
//         Parameter verification
        if (authUser == null) {
            // 0 -> user not found
            return new LoginReturn("", "", 0, "");
        }
        System.out.println("input user info: " + authUser.toString());
        UserInfoDB authUserDb = userMapper.selectByName(authUser.getUserName());

        if (authUserDb==null) {
            // 0 -> user not found
            return new LoginReturn("", "", 0, "");

        } else if (!authUserDb.getPassword().equals(authUser.getPassWord())) {
            // -1 -> user password incorrect
            return new LoginReturn("", "", -1, "");

        } else {

            // generate token
            String token = TokenTool.getToken(authUserDb);
            System.out.println("output user info: " + authUserDb.toString());
            System.out.println("token " + token);
            return new LoginReturn(token, authUserDb.getUser_name(), 1, authUserDb.getUser_type());
        }

    }
}
