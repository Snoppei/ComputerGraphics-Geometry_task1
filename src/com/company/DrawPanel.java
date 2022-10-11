package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawPanel extends JPanel {

    private BufferedImage image;

    public DrawPanel() {
       Sun s = new Sun(70, 100, 40, 50, 30, Color.YELLOW);
    }
    @Override
    protected void paintComponent(Graphics g) {
        try {
            image = ImageIO.read(new File("src/com/company/png/pngegg.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics2D gr = (Graphics2D)g;
        gr.setColor(new Color(0x000000));
        gr.fillRect(0, 0, getWidth(), getHeight());
/*        gr.setColor(new Color(0x29D02D));
        gr.fillRect(0, getWidth()/2, getWidth(), getHeight());*/
        for(int i = 0; i < 200; i++){
            DrawUtils.drawStar(gr, (int)(Math.random()*getWidth()+1), (int)(Math.random()*getHeight()+1), StarType.RANDOM, new Color(0xFFB4FAFA, true));
        }
        DrawUtils.drawSun(gr, 1000, 450, 40, 50, 30, Color.YELLOW);
        g.drawImage(image, 300, 200, this);
        /*(gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(4));
        gr.drawLine(0, 0, 200, 200);
        gr.setColor(new Color(255, 140, 191));
        gr.drawRect(0,0,200,200);
        gr.setColor(new Color(0x484646));
        gr.drawOval(0, 0, 200, 200);*/
        //super.paintComponent(g);
    }
}
