package cn.xn.trend.web;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 3:15
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Value("${version}")
    String version;

    @GetMapping("/")
    public String view() throws Exception {
        return "view";
    }
}
