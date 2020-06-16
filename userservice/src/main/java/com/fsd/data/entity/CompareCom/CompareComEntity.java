package com.fsd.data.entity.CompareCom;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompareComEntity {
    private String specify;
    private String fromdate;
    private String todate;
    private String coorse;
    private String stockex;
    private String comname;
}
