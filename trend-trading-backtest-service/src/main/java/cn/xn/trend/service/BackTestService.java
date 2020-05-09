package cn.xn.trend.service;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 3:05
 */

import cn.xn.trend.client.IndexDataClient;
import cn.xn.trend.pojo.IndexData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BackTestService {
    @Autowired
    IndexDataClient indexDataClient;

    public List<IndexData> listIndexData(String code) {
        List<IndexData> result = indexDataClient.getIndexData(code);
        Collections.reverse(result);

        for (IndexData indexData : result) {
            System.out.println(indexData.getDate());
        }

        return result;
    }
}