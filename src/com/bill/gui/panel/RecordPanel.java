package com.bill.gui.panel;

import com.bill.entity.Category;
import com.bill.gui.model.CategoryComboBoxModel;
import com.bill.utils.ColorUtil;
import com.bill.utils.GUIUtil;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

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
    /**消费详情(栏位名称)*/
    JLabel spendLabel=new JLabel("花费（￥）");
    JLabel categoryLabel=new JLabel("分类");
    JLabel commentLabel=new JLabel("备注");
    JLabel dateLabel=new JLabel("日期");
    /**记录花费金额*/
    public JTextField spendTextField=new JTextField("0");
    /**拉取分类明细*/
    public CategoryComboBoxModel comboBoxModel=new CategoryComboBoxModel();
    public JComboBox<Category> jComboBox=new JComboBox<>(comboBoxModel);
    /**设置备注*/
    public JTextField jTextField=new JTextField();
    /**设置日期*/
    public JXDatePicker datePicker=new JXDatePicker(new Date());
    /**提交按钮*/
    JButton submitButton=new JButton("记一笔");

    public RecordPanel(){
        //设置样式
        GUIUtil.setColor(ColorUtil.grayColor,spendLabel,categoryLabel,commentLabel,dateLabel);
        GUIUtil.setColor(ColorUtil.blueColor,submitButton);
        JPanel inputPanel=new JPanel();
        JPanel submitPanel=new JPanel();
        int gap=40;
        inputPanel.setLayout(new GridLayout(4,2,gap,gap));
        //绑定组件
        inputPanel.add(spendLabel);
        inputPanel.add(spendTextField);
        inputPanel.add(categoryLabel);
        inputPanel.add(jComboBox);
        inputPanel.add(commentLabel);
        inputPanel.add(jTextField);
        inputPanel.add(dateLabel);
        inputPanel.add(datePicker);
        //绑定按钮
        submitPanel.add(submitButton);
        //添加布局
        this.setLayout(new BorderLayout());
        this.add(inputPanel,BorderLayout.NORTH);
        this.add(submitPanel,BorderLayout.CENTER);
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
        GUIUtil.showPanel(RecordPanel.instance);
    }
}
