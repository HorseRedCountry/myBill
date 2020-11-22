package com.bill.sevice;

import com.bill.dao.CategoryDao;
import com.bill.dao.RecordDao;
import com.bill.entity.Category;
import com.bill.entity.Record;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author Major Tom
 * @date 2020/11/22 21:16
 * @description 消费分类service层
 */
public class CategoryService {
    CategoryDao categoryDao=new CategoryDao();
    RecordDao recordDao=new RecordDao();

    /**
     * 列出所有分类
     * @return
     */
    public List<Category> listAllCategory(){
        List<Category> categories=categoryDao.list();
        for (Category category : categories) {
            List<Record> records=recordDao.findRecordsByCategoryId(category.getId());
            category.setRecordNumber(records.size());
        }
        Collections.sort(categories,(c1,c2)->c2.getRecordNumber()-c1.getRecordNumber());
        return categories;
    }

    public void addCategory(String name){
        Category category=new Category();
        category.setName(name);
        categoryDao.addCategory(category);
    }
}
