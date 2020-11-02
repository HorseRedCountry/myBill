package com.bill.gui.panel;

import com.bill.utils.ChartUtil;
import com.bill.utils.GUIUtil;

import javax.swing.*;
import java.awt.*;


/**
 * @author Major Tom
 * @date 2020/10/29 16:57
 * @description 月消费报表面板
 */
public class ReportPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }
    public static ReportPanel instance=new ReportPanel();
    public JLabel label=new JLabel();
    public ReportPanel() {
        this.setLayout(new BorderLayout());
        Image image= ChartUtil.getImage(400,300);
        ImageIcon icon=new ImageIcon(image);
        label.setIcon(icon);
        this.add(label);
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }
}
