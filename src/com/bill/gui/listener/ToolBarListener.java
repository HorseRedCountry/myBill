package com.bill.gui.listener;

import com.bill.gui.panel.*;

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
        }if (button==panel.categoryButton){
            panel.workingPanel.show(CategoryPanel.instance);
        }if (button==panel.backupButton){
            panel.workingPanel.show(BackupPanel.instance);
        }if (button== panel.configButton){
            panel.workingPanel.show(ConfigPanel.instance);
        }if (button== panel.recordButton){
            panel.workingPanel.show(RecordPanel.instance);
        }if (button== panel.recoveryButton){
            panel.workingPanel.show(RecoveryPanel.instance);
        }if (button== panel.spendButton){
            panel.workingPanel.show(SpendPanel.instance);
        }
    }
}
