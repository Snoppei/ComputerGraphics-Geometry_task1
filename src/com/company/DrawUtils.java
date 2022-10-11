package com.company;

import java.awt.*;
import java.util.Random;

public class DrawUtils {
    public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c){
        g.setColor(c);
        g.fillOval(x-r, y-r, 2*r, 2*r);
        double da = 2*Math.PI / n;
        for(int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = r * Math.cos(a) + x;
            double y1 = r * Math.sin(a) + y;
            double x2 = (r+l) * Math.cos(a) + x;
            double y2 = (r+l) * Math.sin(a) + y;
            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }
    }

    public static void drawStar(Graphics2D g, int x, int y, StarType type, Color c){
        //g.setColor(c);
        switch(type){
            case DIM:
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 5, 5);
                break;
            case BRIGHT:
                g.setColor(new Color(0xF6FF00));
                g.fillRect(x, y, 3*3, 3*3);
                g.fillRect(x-(2*3), y+(1*3), 7*3, 1*3);
                g.fillRect(x+(1*3), y-(2*3), 1*3, 7*3);
                g.setColor(Color.WHITE);
                g.fillRect(x+(1*3), y+(1*3), 1*3, 1*3);
                break;
            case NORMAL:
                g.setColor(new Color(0xE03600));
                g.fillRect(x-(2*3), y, 5*3, 1*3);
                g.fillRect(x, y-(2*3), 1*3, 5*3);
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 1*3, 1*3);
                break;
            case RANDOM:
                int typ = (int)(Math.random() * 4);
                StarType rnd;

                if (typ == 2) rnd = StarType.BRIGHT;
                else if (typ == 1) rnd = StarType.DIM;
                else rnd = StarType.NORMAL;
                drawStar(g, x, y, rnd, c);
                break;
        }
    }
/*    public static void drawShip(Graphics2D g, int x, int y, int h, int l, Color c){
        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
        int alpha = c.getAlpha();


        g.setColor(c);
    }*/
}
