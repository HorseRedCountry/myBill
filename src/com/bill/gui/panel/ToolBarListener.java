package com.bill.gui.panel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Major Tom
 * @date 2020/10/29 16:50
 * @description 主面板toolbar监听器
 */
public class ToolBarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel panel=MainPanel.instance;
        JButton button= (JButton) e.getSource();
        if (button==panel.reportButton){
            panel.workingPanel.show(ReportPanel.instance);
        }
    }
}
