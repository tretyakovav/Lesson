package Fiqure;

import java.util.concurrent.RecursiveTask;

public abstract class Fiqure {
    private double a;
    private double b;

    public Fiqure(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public abstract double area();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
