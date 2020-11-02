package com.bill.gui.panel;

import com.bill.utils.ColorUtil;
import com.bill.utils.GUIUtil;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/11/2 20:48
 * @description 备份恢复面板
 */
public class RecoveryPanel extends WorkingPanel{
    static {
        GUIUtil.useLNF();
    }
    public static RecoveryPanel instance=new RecoveryPanel();

    JButton recoveryButton=new JButton("恢复");

    public RecoveryPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,recoveryButton);
        this.add(recoveryButton);
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoveryPanel.instance);
    }
}
