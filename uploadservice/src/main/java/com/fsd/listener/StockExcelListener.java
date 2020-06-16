package com.fsd.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fsd.domain.StockExcel;

import com.fsd.service.StockExcelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class StockExcelListener extends AnalysisEventListener<StockExcel>{
    @Autowired
    StockExcelService stockExcelService;

    private static final Logger LOGGER = LoggerFactory.getLogger(StockExcelListener.class);
    /**
     * 每隔5000条存储数据库，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5000;
    List<StockExcel> list = new ArrayList<>();


    @Override
    public void invoke(StockExcel dailyCaseExcel, AnalysisContext analysisContext) {

        //  LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(dailyCaseExcel);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        stockExcelService.readExcel(list);
        LOGGER.info("存储数据库成功！");
    }
}
