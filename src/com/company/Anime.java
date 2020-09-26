package com.company;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anime extends JPanel{


    private JFrame frame;
    private Timer timer;
    private Image image;
    public Anime() {
        frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(this);
        frame.setVisible(true);
        image =  new ImageIcon("src/anime1.jpg").getImage();
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1,200);

}
    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("src/anime1.jpg").getImage();
                    break;
                case 1:
                    image = new ImageIcon("src/anime2.jpg").getImage();
                    break;
                case 2:
                    image = new ImageIcon("src/anime3.jpg").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 3) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

}
