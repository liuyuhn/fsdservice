package com.fsd.controller;

import com.fsd.data.entity.Login.LoginEntity;
import com.fsd.data.entity.Login.LoginReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.data.entity.ChangePw.ChangePwEntity;
//import com.fsd.data.entity.ChangePw.ChangePwReturn;
import com.fsd.data.entity.UserInfoDB;
import com.fsd.data.mapper.UserInfoMapper;
import com.fsd.tools.TokenTool;

@RestController
@CrossOrigin("*")
@RequestMapping(value="user", method=RequestMethod.POST)
public class ChangePwController {
    private final UserInfoMapper userMapper;
    private static final String OK = "ok";

    @Autowired
    private ChangePwController(UserInfoMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("changepw")
    public String updatePass(@RequestBody(required = true) ChangePwEntity authUser) {

        System.out.println("input user info: " + authUser.toString());
//        UserInfoDB authUserDb = userMapper.selectByName(authUser.getUserName());
//        System.out.println("user info: " + authUserDb.toString());
        String newpw = authUser.getPassWord();
        System.out.println("user getPassWord: " + newpw);
        String uName = authUser.getUserName();
        int authUserDb = userMapper.updateUserpass(uName,newpw);
        System.out.println("update PassWord: " + authUserDb);
        return OK;
    }
}
