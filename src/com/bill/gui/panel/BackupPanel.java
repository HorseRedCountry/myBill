package com.bill.gui.panel;

import com.bill.utils.ColorUtil;
import com.bill.utils.GUIUtil;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/11/2 20:59
 * @description 备份面板
 */
public class BackupPanel extends WorkingPanel{
    static {
        GUIUtil.useLNF();
    }

    public static BackupPanel instance=new BackupPanel();

    JButton backupButton=new JButton("备份");

    public BackupPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,backupButton);
        this.add(backupButton);
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }
}
