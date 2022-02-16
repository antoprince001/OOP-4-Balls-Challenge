package org.challenge;

import processing.core.PApplet;

public class Ball {

    static int  maxHeight = 500, diameter = 10;
    int scale;
    int x;
    float height;

    public Ball(int scale){
        this.scale = scale;
        this.x = 0;
        computeHeight();
    }

    public int getX(){
        this.x = this.x + this.scale;
        return this.x;
    }

    public float getHeight(){
        return this.height;
    }

    public static void setMaxHeight(int value){
        maxHeight = value;
    }

    public static void setDiameter(int value){
        diameter = value;
    }

    private void computeHeight() {
        height =  (maxHeight * this.scale) / 5.0f;
    }


}
