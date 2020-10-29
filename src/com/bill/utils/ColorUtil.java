package com.bill.utils;

import java.awt.*;

/**
 * @author Major Tom
 * @date 2020/10/29 20:51
 * @description 颜色工具类
 */
public class ColorUtil {
    /**
     * 定义四种基准色
     */
    public static Color blueColor=Color.decode("#3399FF");
    public static Color grayColor = Color.decode("#999999");
    public static Color backgroundColor = Color.decode("#eeeeee");
    public static Color warningColor = Color.decode("#FF3333");
    /**
     * 定义基础RGB数值及比率
     */
    private static final int BASE_PER=100;
    private static final int BASE_R=51;
    private static final int BASE_G=255;
    private static final int BASE_B=51;

    /**
     * 按百分比设置颜色
     * @param per 比率
     * @return rgb颜色
     */
    public static Color getByPercentage(int per){
        if (per>BASE_PER){
            per=BASE_PER;
        }
        float rate=per/100f;
        int r= (int) ((BASE_G-BASE_R)*rate+BASE_B);
        int g=BASE_G-r+BASE_B;
        Color color=new Color(r, g, BASE_B);
        return color;
    }
}
