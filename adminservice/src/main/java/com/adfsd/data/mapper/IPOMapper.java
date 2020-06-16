package com.adfsd.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.adfsd.data.entity.IpoDetail.IpoDetailEntity;
@Mapper
@Repository

public interface IPOMapper {
    // IPO
    int updateIPO(IpoDetailEntity ipo);
    List<IpoDetailEntity> listIPO();
}
