package com.bill.gui.panel;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/10/28 22:06
 * @description
 */
public abstract class WorkingPanel extends JPanel {
    /**
     * 更新数据
     */
    public abstract void updateData();

    /**
     * 添加监听器
     */
    public abstract void addListener();
}
