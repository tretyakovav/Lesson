package Fiqure;

public final class Rect extends Fiqure {
    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect(double size) {
        super(size, size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }
}
