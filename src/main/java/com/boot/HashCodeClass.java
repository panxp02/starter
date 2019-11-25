package com.boot;

/**
 * 返回配置字符串的hashcode
 *
 * @author Panxp
 * @date 2019/11/25 20:10
 */
public class HashCodeClass {

    private String targe;

    public HashCodeClass(String target) {
        this.targe = target;
    }

    public String getHashCode() {
        return String.valueOf(this.targe.hashCode());
    }
}
