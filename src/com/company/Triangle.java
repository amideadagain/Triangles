package com.company;

import lombok.ToString;

public class Triangle {
    static public double LineA;
    static public double LineB;
    static public double LineC;

    public double getLineA() {
        return LineA;
    }

    public double getLineB() {
        return LineB;
    }

    public double getLineC() {
        return LineC;
    }

    public void setLineA(double LineA) {
        this.LineA = LineA;
    }

    public void setLineB(double LineB) {
        this.LineB = LineB;
    }

    public void setLineC(double LineC) {
        this.LineC = LineC;
    }
}