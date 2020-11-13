package com.bill.dao;

import com.bill.entity.Record;
import com.bill.utils.DBUtil;
import com.bill.utils.DateUtil;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Major Tom
 * @date 2020/11/13 21:21
 * @description 消费记录crud
 */
public class RecordDao {
    /**
     * 得到所有消费记录的总数
     * @return 总数
     */
    public int getTotalRecords(){
        int total=0;
        String sql="select count(*) from record";
        try {
            Connection connection= DBUtil.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                total=resultSet.getInt(1);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return total;
    }

    /**
     * 增加消费记录
     * @param record 消费记录实体
     */
    public void addRecord(Record record){
        String sql="insert into record values(null,?,?,?,?)";
        try {
            Connection connection=DBUtil.getConnection();
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,record.getSpend());
            ps.setInt(2,record.getCategoryId());
            ps.setString(3,record.getComment());
            ps.setDate(4, DateUtil.util2Sql(record.getDate()));
            ps.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
    /**
     * 测试用
     * @param args
     */
    public static void main(String[] args) {
        RecordDao dao=new RecordDao();
        System.out.println(dao.getTotalRecords());
        Record record=new Record();
        record.setCategoryId(1);
        record.setSpend(100);
        record.setComment("买肉吃");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        record.setDate(new Date());
        dao.addRecord(record);
    }
}
