package com.bill.entity;

import java.util.Date;

/**
 * @author Major Tom
 * @date 2020/10/29 20:30
 * @description 消费记录实体类
 */
public class Record {
    /**主键*/
    private int id;
    /**花费金额*/
    private int spend;
    /**分类ID*/
    private int categoryId;
    /**备注*/
    private String comment;
    /**时间*/
    private Date date;

    public Record(int id, int spend, int categoryId, String comment, Date date) {
        this.id = id;
        this.spend = spend;
        this.categoryId = categoryId;
        this.comment = comment;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
