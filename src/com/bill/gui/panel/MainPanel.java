package com.bill.gui.panel;

import com.bill.utils.GUIUtil;

import javax.swing.*;
import java.awt.*;

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
        GUIUtil.setImageIcon(spendButton,"home.png","消费一览");
        GUIUtil.setImageIcon(recordButton,"record.png","记一笔");
        GUIUtil.setImageIcon(categoryButton,"category2.png","消费分类");
        GUIUtil.setImageIcon(reportButton,"report.png","月消费报表");
        GUIUtil.setImageIcon(configButton,"config.png","设置");
        GUIUtil.setImageIcon(backupButton,"backup.png","备份");
        GUIUtil.setImageIcon(recoveryButton,"restore.png","恢复");

        toolBar.add(spendButton);
        toolBar.add(recordButton);
        toolBar.add(categoryButton);
        toolBar.add(reportButton);
        toolBar.add(configButton);
        toolBar.add(backupButton);
        toolBar.add(recoveryButton);
        toolBar.setFloatable(false);

        workingPanel=new CenterPanel(0.8);

        setLayout(new BorderLayout());
        add(toolBar,BorderLayout.NORTH);
        add(workingPanel,BorderLayout.CENTER);

        addListener();
    }

    /**
     * 对各个按钮添加监听器
     */
    private void addListener() {
        ToolBarListener listener=new ToolBarListener();
        spendButton.addActionListener(listener);
        recordButton.addActionListener(listener);
        categoryButton.addActionListener(listener);
        reportButton.addActionListener(listener);
        configButton.addActionListener(listener);
        backupButton.addActionListener(listener);
        recoveryButton.addActionListener(listener);
        backupButton.addActionListener(listener);
    }
}
