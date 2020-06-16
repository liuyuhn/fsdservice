package com.fsd.controller;

import com.fsd.data.entity.Login.LoginEntity;
import com.fsd.data.entity.Login.LoginReturn;
import com.fsd.data.entity.UserInfoDB;
import com.fsd.data.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsd.data.entity.CompareCom.CompareComEntity;
import com.fsd.data.entity.CompareCom.CompareComReturn;
import com.fsd.data.entity.StockPriceDB;
import com.fsd.data.mapper.CompareComMapper;
import com.fsd.tools.TokenTool;

import java.sql.Timestamp;
import java.util.List;


@RestController
@CrossOrigin("*")
//@RequestMapping(value="stock", method=RequestMethod.POST)
public class CompanyComController {
    private final CompareComMapper comMapper;
//    private static final String OK = "ok";

    @Autowired
    private CompanyComController(CompareComMapper comMapper) {
        this.comMapper = comMapper;
    }
    @PostMapping("genchart")
    public CompareComReturn selectStock(
            @RequestBody(required = true) CompareComEntity stockInfo) {

        System.out.println("stock info: " + stockInfo.toString());
//        StockPriceDB stockInfoDb = comMapper.selectStock(
//                stockInfo.getComname(),stockInfo.getFromdate(),stockInfo.getTodate());
//        System.out.println("查询出的stock info: " + stockInfoDb);
//        String price =stockInfoDb.getPrice();
//        String price_min =stockInfoDb.getPrice_min();
//        return new CompareComReturn(price,price_min);
        List<CompareComReturn> priceInfo = comMapper.selectStock(stockInfo.getComname(),stockInfo.getFromdate(),stockInfo.getTodate());
        return new CompareComReturn(priceInfo);
    }
}
