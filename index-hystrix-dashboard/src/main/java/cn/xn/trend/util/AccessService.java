package cn.xn.trend.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * @author xinn
 * @date 2020/5/19 0019 下午 10:08
 */
public class AccessService {
    public static void main(String[] args) {

        while (true) {
            ThreadUtil.sleep(1000);
            try {
                String html = HttpUtil.get("http://127.0.0.1:8051/simulate/399975/20/1.01/0.99/0/null/null/");
                System.out.println("html length:" + html.length());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
