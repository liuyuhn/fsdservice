package com.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.data.entity.IpoList.IpoListEntity;
//import com.fsd.data.entity.IpoList.IpoListReturn;
import com.fsd.data.mapper.IPOMapper;

@RestController
@RequestMapping("user/ipo")
@CrossOrigin("*")
public class IpoController {
    private IPOMapper ipoMapper;

    @Autowired
    private IpoController(IPOMapper ipoMapper) {
        this.ipoMapper = ipoMapper;
    }

//    @PostMapping("add")
//    private IpoListReturn addIpo(@RequestBody(required = true) IpoListEntity ipo) {
//        int status = ipoMapper.addIPO(ipo);
//        if (status==1) {
//            return new IpoListReturn("ok");
//        }
//        return new IpoListReturn("failed");
//    }

    @GetMapping("list")
    @ResponseBody
    public List<IpoListEntity> listipo() {

        return ipoMapper.listIPO();
    }
}
