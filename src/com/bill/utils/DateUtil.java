package com.bill.utils;

import java.sql.Date;

/**
 * @author Major Tom
 * @date 2020/11/13 21:38
 * @description 时间工具类
 */
public class DateUtil {

    public static Date util2Sql(java.util.Date date){
        return new Date(date.getTime());
    }

}
