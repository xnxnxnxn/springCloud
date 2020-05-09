package cn.xn.trend.controller;

import cn.xn.trend.pojo.Index;
import cn.xn.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 1:28
 */
@RestController
public class IndexController {
    @Autowired
    IndexService indexService;


    @GetMapping("/freshCodes")
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }

    @GetMapping("/getCodes")
    public List<Index> get() throws Exception {
        return indexService.get();
    }

    @GetMapping("/removeCodes")
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }
}