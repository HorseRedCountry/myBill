package com.bill.entity;

/**
 * @author Major Tom
 * @date 2020/10/30 14:06
 * @description 系统设置实体类
 */
public class Config {
    private int id;
    /**以键值对的形式存储配置信息*/
    private String key;
    private String value;

    public Config() { }

    public Config(int id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
