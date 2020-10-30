package com.bill.utils;

import javax.swing.*;
import java.awt.*;

/**
 * @author Major Tom
 * @date 2020/10/30 16:03
 * @description 环形进度显示工具类
 */
public class CircleProgressBar extends JPanel {
    private int minProgress;
    private int maxProgress;
    private int progress;
    private String progressText;
    private Color backgroundColor;
    private Color foregroundColor;

    public CircleProgressBar(){
        minProgress=0;
        maxProgress=100;
        progressText="0%";
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        //绘制2D图形
        Graphics2D graphics2D= (Graphics2D) graphics;
        //开启抗锯齿
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int fontSize = 0;
        if (getWidth() >= getHeight()) {
            x = (getWidth() - getHeight()) / 2 + 25;
            y = 25;
            width = getHeight() - 50;
            height = getHeight() - 50;
            fontSize = getWidth() / 8;
        } else {
            x = 25;
            y = (getHeight() - getWidth()) / 2 + 25;
            width = getWidth() - 50;
            height = getWidth() - 50;
            fontSize = getHeight() / 8;
        }
        graphics2D.setStroke(new BasicStroke(20.0f));
        graphics2D.setColor(backgroundColor);
        graphics2D.drawArc(x, y, width, height, 0, 360);
        graphics2D.setColor(foregroundColor);
        graphics2D.drawArc(x, y, width, height, 90,
                -(int) (360 * ((progress * 1.0) / (maxProgress - minProgress))));
        graphics2D.setFont(new Font("黑体", Font.BOLD, fontSize));
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int digitalWidth = fontMetrics.stringWidth(progressText);
        int digitalAscent = fontMetrics.getAscent();
        graphics2D.setColor(foregroundColor);
        graphics2D.drawString(progressText, getWidth() / 2 - digitalWidth / 2, getHeight() / 2 + digitalAscent / 2);
    }

    public void setProgress(int progress) {
        if (progress>=minProgress&&progress<=maxProgress){
            this.progress=progress;
        }
        if (progress>maxProgress){
            this.progress=maxProgress;
        }
        this.progressText=progress+"%";
        this.repaint();
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        this.repaint();
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
        this.repaint();
    }

    public int getProgress(){
        return progress;
    }
}
