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
            //preparestatement用于执行动态SQL语句，语句会被解析和编译，适用于动态插值
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
            //statement用于执行静态SQL语句，即直接执行定义好的语句
            Statement statement=connection.createStatement();
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    /**
     * 更新分类明细
     * @param category 分类
     */
    public void updateCategory(Category category){
        String sql="update category set name=? where id =?";
        try {
            Connection connection=DBUtil.getConnection();
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, category.getName());
            ps.setInt(2,category.getId());
            ps.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * 根据id查询分类
     * @param id 分类id
     * @return 对应的分类
     */
    public Category getCategory(int id){
        String sql="select * from category where id ="+id;
        Category category=new Category();
        try {
            Connection connection=DBUtil.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            if (resultSet.next()){
                String name=resultSet.getString(2);
                category.setName(name);
                category.setId(id);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return category;
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
//        dao.deleteCategory(2);
//        Category category=new Category();
//        category.setName("安排");
//        category.setId(1);
//        dao.updateCategory(category);
        System.out.println(dao.getCategory(1).toString());
    }
}
