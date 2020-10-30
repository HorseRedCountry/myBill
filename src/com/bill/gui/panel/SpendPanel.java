package com.bill.gui.panel;

import com.bill.utils.CircleProgressBar;
import com.bill.utils.ColorUtil;

import javax.swing.*;
import java.awt.*;

import static com.bill.utils.GUIUtil.setColor;
import static com.bill.utils.GUIUtil.showPanel;

/**
 * @author Major Tom
 * @date 2020/10/30 14:20
 * @description 消费面板
 */
public class SpendPanel extends WorkingPanel {

    public static SpendPanel instance=new SpendPanel();

    JLabel monthSpendLabel=new JLabel("本月消费");
    JLabel todaySpendLabel=new JLabel("今日消费");
    JLabel averageSpendPerDayLabel=new JLabel("日均消费");
    JLabel monthLeftSpendLabel=new JLabel("本月剩余");
    JLabel dayAverageAvailableSpendLabel=new JLabel("日均可用");
    JLabel monthEndSpendLabel=new JLabel("距离月末");

    JLabel vMonthSpend = new JLabel("");
    JLabel vTodaySpend = new JLabel("");
    JLabel vAvgSpendPerDay = new JLabel("");
    JLabel vMonthAvailable = new JLabel("");
    JLabel vDayAvgAvailable = new JLabel("");
    JLabel vMonthLeftDay = new JLabel("");

    CircleProgressBar bar;

    public SpendPanel(){
        this.setLayout(new BorderLayout());
        bar=new CircleProgressBar();
        bar.setBackgroundColor(ColorUtil.blueColor);
        setColor(ColorUtil.grayColor, monthSpendLabel, todaySpendLabel, averageSpendPerDayLabel, monthLeftSpendLabel, dayAverageAvailableSpendLabel,
                monthEndSpendLabel, vAvgSpendPerDay, vMonthAvailable, vDayAvgAvailable, vMonthLeftDay);
        setColor(ColorUtil.blueColor, vMonthSpend, vTodaySpend);

        vMonthSpend.setFont(new Font("微软雅黑", Font.BOLD, 23));
        vTodaySpend.setFont(new Font("微软雅黑", Font.BOLD, 23));

        this.add(center(), BorderLayout.CENTER);
        this.add(south(), BorderLayout.SOUTH);
    }

    private JPanel center(){
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(west(),BorderLayout.WEST);
        panel.add(east());
        return panel;
    }

    private Component east(){
        return bar;
    }

    private Component west(){
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(4,1));
        panel.add(monthSpendLabel);
        panel.add(vMonthSpend);
        panel.add(todaySpendLabel);
        panel.add(vTodaySpend);
        return panel;
    }

    private JPanel south(){
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(2,4));
        panel.add(averageSpendPerDayLabel);
        panel.add(monthLeftSpendLabel);
        panel.add(dayAverageAvailableSpendLabel);
        panel.add(monthEndSpendLabel);
        panel.add(vAvgSpendPerDay);
        panel.add(vMonthAvailable);
        panel.add(vDayAvgAvailable);
        panel.add(vMonthLeftDay);

        return panel;
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }

    public static void main(String[] args) {
        showPanel(SpendPanel.instance);
    }
}
