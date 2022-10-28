package com.company.number3;

public class PotentialEnergy {
    private static final int g = 10;
    private int h;
    private int m;

    public PotentialEnergy() {

    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    public int potEn(){
        return g*m*h;
    }
}
