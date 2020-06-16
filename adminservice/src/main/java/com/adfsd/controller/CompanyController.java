package com.adfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adfsd.data.entity.ComList.ComListEntity;
import com.adfsd.data.entity.ComList.ComListReturn;
import com.adfsd.data.mapper.CompanyMapper;

@RestController
@RequestMapping("admin/company")
@CrossOrigin("*")
public class CompanyController {
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyController(CompanyMapper companyMapper) {

        this.companyMapper = companyMapper;
    }

    @PostMapping("add")
    public ComListReturn addCompany(@RequestBody(required = true) ComListEntity company) {

        int status = companyMapper.addCompany(company);
//        if (status==1) {
//            return new ComListReturn("ok");
//        }
        return new ComListReturn("ok");
    }

//    @PostMapping("disable")
//    public ComListReturn disableCompany(@RequestBody(required = true) ComListEntity company) {
//
//        int status = companyMapper.disableCompanyByCode(company.getCompany_code());
//        if (status ==1) {
//            return new ComListReturn("ok");
//        }
//        return new ComListReturn("failed");
//    }

    @PostMapping("update")
    public ComListReturn updateCompany(@RequestBody(required = true) ComListEntity company) {

        int status = companyMapper.updateCompany(company);
//        if (status == 1) {
//            return new ComListReturn("ok");
//        }
        return new ComListReturn("ok");
    }

    @GetMapping("list")
    public List<ComListEntity> listCompany() {
        return companyMapper.listCompany();
    }

    @PostMapping("name")
    public ComListEntity getCompanyByName(@RequestBody(required = true) ComListEntity company) {
        return companyMapper.getCompanyByName(company.getCompany_name());
    }

//    @PostMapping("code")
//    public ComListReturn getCompanyByCode(@RequestBody(required = true) ComListReturn company) {
//        return companyMapper.getCompanyByCode(company.getCompany_code());
//    }
}
