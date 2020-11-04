package com.bill.entity;

/**
 * @author Major Tom
 * @date 2020/10/29 21:46
 * @description 消费类别实体
 */
public class Category {
    /**自增id*/
    private int id;
    /**类别名称*/
    private String name;
    /**消费次数*/
    private int recordNumber;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
