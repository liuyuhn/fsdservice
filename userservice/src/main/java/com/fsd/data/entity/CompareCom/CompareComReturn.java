package com.fsd.data.entity.CompareCom;

import com.fsd.data.entity.CompareCom.CompareComReturn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompareComReturn {
//    private String stockinfo;
//    private String price;
//    private String price_min;
    List<CompareComReturn> priceInfo;
//    private Timestamp price_min;
//    public CompareComReturn(String price, String price_min) {
////        super();
////        this.token = token;
//        this.price = price;
//        this.price_min = price_min;
//    }
}
