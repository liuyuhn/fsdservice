package com.fsd.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.fsd.data.entity.IpoList.IpoListEntity;

@Mapper
@Repository
public interface IPOMapper {
//    int addIPO(IpoListEntity ipo);
    List<IpoListEntity> listIPO();
}
