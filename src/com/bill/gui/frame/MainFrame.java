package com.bill.gui.frame;

import com.bill.gui.panel.MainPanel;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/10/28 20:20
 * @description 账单主窗体
 */
public class MainFrame extends JFrame {
    public static MainFrame instance=new MainFrame();
    private MainFrame(){
        //设置窗体大小
        this.setSize(500,450);
        //设置标题栏文字
        this.setTitle("我的小账本");
        //设置窗体相对指定组件的位置（null表示窗体位于屏幕中间）
        this.setLocationRelativeTo(null);
        //设置窗体是否可可由用户自主设置大小
        this.setResizable(false);
        this.setContentPane(MainPanel.instance);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        instance.setVisible(true);
    }
}
