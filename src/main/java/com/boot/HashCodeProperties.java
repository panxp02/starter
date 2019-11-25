package com.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件读取类
 *
 * @author Panxp
 * @date 2019/11/25 20:12
 */
@ConfigurationProperties(
        prefix = "boot.hashcode"
)
public class HashCodeProperties {

    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
