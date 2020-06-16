package com.fsd.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.fsd.data.entity.CompareCom.CompareComEntity;
import com.fsd.data.entity.CompareCom.CompareComReturn;
import com.fsd.data.entity.StockPriceDB;

@Mapper
@Repository

public interface CompareComMapper {
//    List<CompareComEntity> selectStock(String comname,String fromdate,String todate);
//    int addUser(StockPriceDB stock);
//    String getCompanyName(String companyName);
    List<CompareComReturn> selectStock(String comname,String fromdate,String todate);
//List<PriceReturnEntity> getPrice1(CompareInputEntity single);
}
