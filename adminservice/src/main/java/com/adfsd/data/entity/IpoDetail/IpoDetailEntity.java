package com.adfsd.data.entity.IpoDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IpoDetailEntity {
    private String company_name;
    private String stock_exchange;
    private int price_per_share;
    private int total_num;
    private String open_date;
    private String remark;
}
