package com.fsd.service;

import com.fsd.dao.StockExcelDao;

import com.fsd.domain.StockExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockExcelService {
    @Autowired
    StockExcelDao stockExcelDao;

    public void readExcel(List<StockExcel> stockExcelList){
        List<StockExcel> getExcel= stockExcelDao.findAll();
        stockExcelDao.deleteAll(getExcel);
        stockExcelDao.saveAll(stockExcelList);
    }
}
