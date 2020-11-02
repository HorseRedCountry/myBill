package com.bill.gui.panel;

import com.bill.utils.ColorUtil;
import com.bill.utils.GUIUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author Major Tom
 * @date 2020/11/2 20:37
 * @description 配置面板
 */
public class ConfigPanel extends WorkingPanel{
    static {
        GUIUtil.useLNF();
    }
    public static ConfigPanel instance=new ConfigPanel();
    /**定义组件*/
    JLabel budgetLabel=new JLabel("本月预算（￥）");
    public JTextField budgetTextField=new JTextField("0");
    JLabel mysqlLabel=new JLabel("MySQL安装目录");
    public JTextField mysqlTextField=new JTextField();
    JButton submitButton=new JButton("更新");

    public ConfigPanel() {
        //设置显示样式
        GUIUtil.setColor(ColorUtil.grayColor, budgetLabel,mysqlLabel);
        GUIUtil.setColor(ColorUtil.blueColor, submitButton);
        //定义布局
        JPanel pInput =new JPanel();
        JPanel pSubmit = new JPanel();
        int gap =40;
        pInput.setLayout(new GridLayout(4,1,gap,gap));
        //放置组件
        pInput.add(budgetLabel);
        pInput.add(budgetTextField);
        pInput.add(mysqlLabel);
        pInput.add(mysqlTextField);
        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);
        pSubmit.add(submitButton);
        this.add(pSubmit,BorderLayout.CENTER);
        //添加监听器
        addListener();
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(ConfigPanel.instance);
    }
}
