package com.adfsd.data.mapper;

import java.util.List;

import com.adfsd.data.entity.ExchangeList.ExchangeListEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//import com.adfsd.data.entity.ExchangeList.ExchangeListEntity;

@Mapper
@Repository
public interface ExchangeListMapper {
    int addExchangeList(ExchangeListEntity stockCenter);
    int updateExchangeList(ExchangeListEntity stockCenter);
    List<ExchangeListEntity> listExchangeList();
//    ExchangeListEntity getCompanyByName(String companyName);
}
