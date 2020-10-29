package com.bill.gui.panel;

import com.bill.entity.Category;
import com.bill.gui.model.CategoryTableModel;
import com.bill.utils.ColorUtil;
import com.bill.utils.GUIUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author Major Tom
 * @date 2020/10/29 21:26
 * @description 消费分类面板
 */
public class CategoryPanel extends WorkingPanel{
    static {
        GUIUtil.useLNF();
    }
    public static CategoryPanel instance=new CategoryPanel();
    public JButton addButton=new JButton("新增");
    public JButton editButton=new JButton("编辑");
    public JButton deleteButton=new JButton("删除");
    String[] columns=new String[]{"分类名称","消费次数"};
    public CategoryTableModel model=new CategoryTableModel();
    public JTable table=new JTable(model);

    public CategoryPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,addButton,editButton,deleteButton);
        JScrollPane scrollPane=new JScrollPane(table);
        JPanel submitPanel=new JPanel();
        submitPanel.add(addButton);
        submitPanel.add(editButton);
        submitPanel.add(deleteButton);

        this.setLayout(new BorderLayout());
        this.add(scrollPane,BorderLayout.CENTER);
        this.add(submitPanel,BorderLayout.SOUTH);

        addListener();
    }
    public Category getSelectedCategory(){
        int index=table.getSelectedRow();
        return model.categorys.get(index);
    }
    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }
}
