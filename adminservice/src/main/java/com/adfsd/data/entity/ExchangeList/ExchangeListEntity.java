package com.adfsd.data.entity.ExchangeList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExchangeListEntity {
    private String stock_exchange;
    private String brief;
    private String contact_address;
    private String remark;
}
