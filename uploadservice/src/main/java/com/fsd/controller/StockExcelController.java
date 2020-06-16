package com.fsd.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.fsd.dao.StockExcelDao;
import com.fsd.domain.StockExcel;
import com.fsd.listener.StockExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Controller
@CrossOrigin("*")
@RequestMapping("/excel")
public class StockExcelController {
    @Autowired
    StockExcelListener stockExcelListener;

    @Autowired
    StockExcelDao stockExcelDao;

    @RequestMapping("/import")
    @ResponseBody
    public String read( @RequestParam("file") MultipartFile uploadExcel ) {

        try {
            ExcelReaderBuilder readWorkBook = EasyExcel.read(uploadExcel.getInputStream(), StockExcel.class, stockExcelListener);
            ExcelReaderSheetBuilder sheet = readWorkBook.sheet();
            sheet.doRead();

            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @GetMapping ("/show")
    @ResponseBody
    public List<StockExcel> getAll(){
        return stockExcelDao.findAll();
    }
}
