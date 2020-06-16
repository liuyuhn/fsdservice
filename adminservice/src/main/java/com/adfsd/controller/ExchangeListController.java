package com.adfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adfsd.data.entity.ExchangeList.ExchangeListEntity;
import com.adfsd.data.entity.ExchangeList.ExchangeListReturn;
import com.adfsd.data.mapper.ExchangeListMapper;

@RestController
@RequestMapping("admin/exchange")
@CrossOrigin("*")
public class ExchangeListController {
    private ExchangeListMapper scmapper;

    @Autowired
    private ExchangeListController(ExchangeListMapper scmapper) {

        this.scmapper = scmapper;
    }

    @PostMapping("add")
    public ExchangeListReturn addExchangeList (@RequestBody(required = true) ExchangeListEntity stockCenter) {
        int status = scmapper.addExchangeList(stockCenter);
//        if (status==1) {
//            return new ExchangeListReturn("ok");
//        }
        return new ExchangeListReturn("ok");
    }

    @PostMapping("update")
    public ExchangeListReturn updateExchangeList (@RequestBody(required = true) ExchangeListEntity stockCenter) {
        int status = scmapper.updateExchangeList(stockCenter);
//        if (status==1) {
//            return new ExchangeListReturn("ok");
//        }
        return new ExchangeListReturn("ok");
    }

    @GetMapping("list")
    public List<ExchangeListEntity> listExchangeList() {

        return scmapper.listExchangeList();
    }
}
