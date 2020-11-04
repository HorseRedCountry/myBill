package com.bill.dao;

import com.bill.entity.Category;
import com.bill.utils.DBUtil;

import java.sql.*;

/**
 * @author Major Tom
 * @date 2020/11/3 21:46
 * @description 消费分类crud
 */
public class CategoryDao {
    /**
     * 增加分类
     * @param category 分类明细
     */
    public void addCategory(Category category){
        //定义SQL查询语句
        String sql="insert into category values(null,?)";
        try {
            //新建连接
            Connection connection= DBUtil.getConnection();
            PreparedStatement ps=connection.prepareStatement(sql);
            //设置映射栏位
            ps.setString(1, category.getName());
            //执行
            ps.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * 删除分类
     * @param categoryId 分类id
     */
    public void deleteCategory(int categoryId){
        //定义SQL语句
        String sql="delete from category where id = "+categoryId;
        //获取数据库连接
        try {
            Connection connection=DBUtil.getConnection();
            Statement statement=connection.createStatement();
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        CategoryDao dao=new CategoryDao();
//        Category category=new Category();
//        category.setName("日常开销");
//        dao.addCategory(category);
        dao.deleteCategory(2);
    }
}
