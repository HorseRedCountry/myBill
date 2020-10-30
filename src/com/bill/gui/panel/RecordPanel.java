package com.bill.gui.panel;

import com.bill.utils.GUIUtil;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/10/30 14:10
 * @description 消费记录面板
 */
public class RecordPanel extends WorkingPanel{
    static {
        GUIUtil.useLNF();
    }
    public static RecordPanel instance=new RecordPanel();

    JLabel spendLabel=new JLabel("花费（￥）");
    JLabel categoryLabel=new JLabel("分类");
    JLabel commentLabel=new JLabel("备注");
    JLabel dateLabel=new JLabel("日期");

    public JTextField spendTextField=new JTextField("0");


    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }
}
