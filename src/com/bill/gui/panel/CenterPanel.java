package com.bill.gui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Major Tom
 * @date 2020/10/28 21:12
 * @description 面板工具类
 */
public class CenterPanel extends JPanel {
    /**拉伸比例*/
    private double rate;
    /**显示的组件*/
    private JComponent component;
    /**是否拉伸*/
    private boolean strech;

    public CenterPanel(double rate,boolean strech){
        this.setLayout(null);
        this.rate=rate;
        this.strech=strech;
    }

    public CenterPanel(double rate){
        this(rate,true);
    }

    @Override
    public void repaint() {
        if (null!=component){
            Dimension containerSize=this.getSize();
            Dimension componentSize=component.getSize();
            if (strech){
                component.setSize((int)(containerSize.width*rate),(int)(containerSize.height*rate));
            }else {
                component.setSize(componentSize);
            }
            component.setLocation(containerSize.width/2-component.getSize().width/2,containerSize.height/2-component.getSize().height/2);
        }
        super.repaint();
    }

    public void show(JComponent p){
        this.component=p;
        Component[] cs=getComponents();
        for (Component c : cs) {
            remove(c);
        }
        add(p);
        if (p instanceof WorkingPanel){
            ((WorkingPanel)p).updateData();
        }
        this.updateUI();
    }
}
