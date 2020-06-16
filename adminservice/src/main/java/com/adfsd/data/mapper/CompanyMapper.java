package com.adfsd.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.adfsd.data.entity.ComList.ComListEntity;

@Mapper
@Repository
public interface CompanyMapper {
    int addCompany(ComListEntity company);
    int disableCompanyByCode(String company_code);
    int updateCompany(ComListEntity company);

    List<ComListEntity> listCompany();
    ComListEntity getCompanyByName(String companyName);
    ComListEntity getCompanyByCode(String companyCode);
}
