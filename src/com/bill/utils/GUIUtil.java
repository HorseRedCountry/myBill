package com.bill.utils;

import com.bill.gui.panel.CenterPanel;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author Major Tom
 * @date 2020/10/28 20:55
 * @description GUI工具类
 */
public class GUIUtil {
    private static String imageFolder="D:/myProjects/hutubill/img";

    /**
     * 设置按钮上的图标
     * @param button 对应的按钮
     * @param fileName 文件名
     * @param tips 备注
     */
    public static void setImageIcon(JButton button,String fileName,String tips){
        ImageIcon icon=new ImageIcon(new File(imageFolder,fileName).getAbsolutePath());
        button.setIcon(icon);
        button.setPreferredSize(new Dimension(61,81));
        button.setToolTipText(tips);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setText(tips);
    }

    /**
     * 设置窗体颜色
     * @param color 颜色
     * @param cs 窗体
     */
    public static void setColor(Color color,JComponent... cs){
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }

    /**
     * 设置窗体显示大小
     * @param panel 窗体
     * @param strechRate 拉伸比例
     */
    public static void showPanel(JPanel panel,double strechRate){
        GUIUtil.useLNF();
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        CenterPanel centerPanel=new CenterPanel(strechRate);
        frame.setContentPane(centerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        centerPanel.show(panel);
    }

    /**
     * 显示窗体
     * @param panel 对应的窗体
     */
    public static void showPanel(JPanel panel){
        showPanel(panel,0.85);
    }

    /**
     * 设置显示样式
     */
    public static void useLNF(){
        try {
            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
