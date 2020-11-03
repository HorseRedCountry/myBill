package com.bill.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Major Tom
 * @date 2020/11/3 21:49
 * @description 连接数据库工具类
 */
public class DBUtil {
    static final String IP="127.0.0.1";
    static final int PORT=3306;
    static final String DATABASE="my_bill";
    static final String ENCODING="UTF-8";
    static final String USERNAME="root";
    static final String PASSWORD="1234";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url=String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",IP,PORT,DATABASE,ENCODING);
        return DriverManager.getConnection(url,USERNAME,PASSWORD);
    }
}
