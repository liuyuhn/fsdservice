package com.fsd.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "stock_price")
public class StockExcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ExcelProperty(index = 0)
    @Column(name = "company_name")
    private String companyName;

    @ExcelProperty(index = 1)
    @Column(name = "stock_exchange")
    private String StockExchange;

    @ExcelProperty(index = 2)
    @Column(name = "price")
    private String Price;

    @ExcelProperty(index = 3)
    @Column(name = "price_min")
    private Date PriceMin;

}
