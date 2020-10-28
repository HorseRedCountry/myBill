package com.bill.gui.panel;

import com.bill.utils.GUIUtil;

import javax.swing.*;

/**
 * @author Major Tom
 * @date 2020/10/28 20:32
 * @description 主面板
 */
public class MainPanel extends JPanel{
    static {
        GUIUtil.useLNF();
    }
    public static MainPanel instance=new MainPanel();
    public JToolBar toolBar=new JToolBar();
    public JButton spendButton=new JButton();
    public JButton recordButton=new JButton();
    public JButton categoryButton=new JButton();
    public JButton reportButton=new JButton();
    public JButton configButton=new JButton();
    public JButton backupButton=new JButton();
    public JButton recoveryButton=new JButton();

    public CenterPanel workingPanel;

    private MainPanel(){

    }
}
