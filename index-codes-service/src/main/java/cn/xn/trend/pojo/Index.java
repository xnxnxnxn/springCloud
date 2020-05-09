package cn.xn.trend.pojo;

import java.io.Serializable;

/**
 * @author xinn
 * @date 2020/5/9 0009 下午 1:25
 */
public class Index implements Serializable {
    String code;
    String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
