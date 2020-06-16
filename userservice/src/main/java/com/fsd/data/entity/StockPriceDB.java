package com.fsd.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockPriceDB {
    private int id;
    private String company_name;
    private String stock_exchange;
    private String price;
    private String price_min;
}
