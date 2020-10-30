package com.bill.gui.model;

import com.bill.entity.Category;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.List;

/**
 * @author Major Tom
 * @date 2020/10/30 14:15
 * @description
 */
public class CategoryComboBoxModel implements ComboBoxModel<Category> {
    @Override
    public void setSelectedItem(Object anItem) {

    }

    @Override
    public Object getSelectedItem() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Category getElementAt(int index) {
        return null;
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
