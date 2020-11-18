package com.bill.dao;

import com.bill.entity.Config;
import com.bill.utils.DBUtil;

import java.sql.*;

/**
 * @author Major Tom
 * @date 2020/11/15 21:56
 * @description 相关配置（月消费总额与备份恢复）的crud操作
 */
public class ConfigDao {
    /**
     * 得到所有配置信息的总数
     * @return 配置信息总数
     */
    public int getTotal(){
        int total=0;
        String sql="select count(*) from config";
        try (Connection connection= DBUtil.getConnection();
             Statement statement=connection.createStatement();
             ){
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                total=rs.getInt(1);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return total;
    }

    /**
     * 添加配置信息
     * @param config 配置信息实体
     */
    public void addConfig(Config config){
        String sql="insert into config values(null,?,?)";
        try(Connection connection=DBUtil.getConnection();
            PreparedStatement ps=connection.prepareStatement(sql);
            ) {
            ps.setString(1,config.getKey());
            ps.setString(2,config.getValue());
            ps.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * 删除一条配置信息
     * @param id 配置信息id
     */
    public void deleteConfig(int id){
        String sql="delete from config where id ="+id;
        try (Connection connection = DBUtil.getConnection();
            Statement statement=connection.createStatement();) {
            statement.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * 修改一条配置信息
     * @param config 配置信息实体
     */
    public void updateConfig(Config config){
        String sql="update config set key=?,value=? where id=?";
        try (Connection connection = DBUtil.getConnection();
            PreparedStatement ps=connection.prepareStatement(sql);) {
            ps.setString(1,config.getKey());
            ps.setString(2,config.getValue());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * 查询并返回一条配置信息
     * @param id 配置信息id
     * @return
     */
    public Config getConfig(int id){
        Config config=new Config();
        String sql="select * from config where id ="+id;
        try (Connection connection = DBUtil.getConnection();
            Statement statement=connection.createStatement();) {
            ResultSet rs=statement.executeQuery(sql);
            if (rs.next()){
                String key=rs.getString("key");
                String value=rs.getString("value");
                config.setKey(key);
                config.setValue(value);
                config.setId(id);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return config;
    }

    /**
     * 通过配置信息的配置名来查询配置信息
     * @param key 配置信息的配置名
     * @return 对应的配置信息
     */
    public Config getByKey(String key){
        Config config=new Config();
        String sql="select * from config where key ="+key;
        try (Connection connection = DBUtil.getConnection();
             Statement statement=connection.createStatement();) {
            ResultSet rs=statement.executeQuery(sql);
            if (rs.next()){
                int id=rs.getInt("id");
                String value=rs.getString("value");
                config.setKey(key);
                config.setValue(value);
                config.setId(id);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return config;
    }
}
