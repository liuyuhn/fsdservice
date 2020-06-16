package com.adfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adfsd.data.entity.IpoDetail.IpoDetailEntity;
import com.adfsd.data.entity.IpoDetail.IpoDetailReturn;
import com.adfsd.data.mapper.IPOMapper;

@RestController
@RequestMapping("admin/ipo")
@CrossOrigin("*")
public class IpoAdController {
    private IPOMapper ipoMapper;

    @Autowired
    private IpoAdController(IPOMapper ipoMapper) {
        this.ipoMapper = ipoMapper;
    }

    @PostMapping("update")
    private IpoDetailReturn updateIPO(@RequestBody(required = true) IpoDetailEntity ipo) {
        int status = ipoMapper.updateIPO(ipo);
//        if (status==1) {
//            return new IpoDetailReturn("ok");
//        }
        return new IpoDetailReturn("ok");
    }

    @GetMapping("list")
    public List<IpoDetailEntity> listipo() {
        return ipoMapper.listIPO();
    }
}
