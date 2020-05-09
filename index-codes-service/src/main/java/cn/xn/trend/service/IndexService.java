package cn.xn.trend.service;

import cn.hutool.core.collection.CollUtil;
import cn.xn.trend.pojo.Index;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 1:26
 */
@Service
@CacheConfig(cacheNames = "indexes")
public class IndexService {
    private List<Index> indexes;

    @Cacheable(key = "'all_codes'")
    public List<Index> get() {
        Index index = new Index();
        index.setName("无效指数代码");
        index.setCode("000000");
        return CollUtil.toList(index);
    }
}