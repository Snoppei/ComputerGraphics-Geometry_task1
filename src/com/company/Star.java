package com.company;

import java.awt.*;

public class Star {
    int x, y;
    StarType type;
    Color color;

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

    public StarType getType() {
        return type;
    }

    public void setType(StarType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Star(int x, int y, StarType type, Color color) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.color = color;
    }
}
