package com.company;

//import org.jetbrains.annotations.Contract;

public class Pair {
    private double x;
    private double y;
    public Pair(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
