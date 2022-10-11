package com.company;

import java.awt.*;

public class Sun {
    private int x, y, r, l, n;
    private Color c;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Sun(int x, int y, int r, int l, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.l = l;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        DrawUtils.drawSun(g, x, y, r, l, n, c);
    }
}
