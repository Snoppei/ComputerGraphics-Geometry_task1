package com.company;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private DrawPanel dp;
    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        dp = new DrawPanel();
        this.add(dp);
    }
}
