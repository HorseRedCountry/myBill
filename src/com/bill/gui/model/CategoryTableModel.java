package com.bill.gui.model;

import com.bill.entity.Category;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Major Tom
 * @date 2020/10/29 21:40
 * @description 分类面板的表格显示模型
 */
public class CategoryTableModel implements TableModel {

    String[] columns=new String[]{"分类名称","消费次数"};
    public List<Category> categorys=new ArrayList<>();

    @Override
    public int getRowCount() {
        return categorys.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category category=categorys.get(rowIndex);
        if (0==columnIndex){
            return category.getName();
        }
        if (1==columnIndex){
            return category.getRecordNumber();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
