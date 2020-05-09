package cn.xn.trend.job;

import cn.hutool.core.date.DateUtil;
import cn.xn.trend.pojo.Index;
import cn.xn.trend.service.IndexDataService;
import cn.xn.trend.service.IndexService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 2:26
 */
public class IndexDataSyncJob extends QuartzJobBean {
    @Autowired
    private IndexService indexService;

    @Autowired
    private IndexDataService indexDataService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("定时启动：" + DateUtil.now());
        List<Index> indexes = indexService.fresh();
        for (Index index : indexes) {
            indexDataService.fresh(index.getCode());
        }
        System.out.println("定时结束：" + DateUtil.now());

    }
}
