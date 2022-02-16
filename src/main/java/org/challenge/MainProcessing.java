package org.challenge;

import processing.core.PApplet;

public class MainProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final int DIAMETER  = 10;

    Ball b1,b2,b3,b4;

    public static void main(String[] args) {
        PApplet.main("org.challenge.MainProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){

        Ball.setMaxHeight(HEIGHT);
        Ball.setDiameter(DIAMETER);

        b1 = new Ball(1);
        b2 = new Ball(2);
        b3 = new Ball(3);
        b4 = new Ball(4);
    }
    @Override
    public void draw(){

        drawCircle(b1);
        drawCircle(b2);
        drawCircle(b3);
        drawCircle(b4);
    }

    private void drawCircle(Ball b1) {
        ellipse(b1.getX(), b1.getHeight(), Ball.diameter, Ball.diameter);
    }
}
