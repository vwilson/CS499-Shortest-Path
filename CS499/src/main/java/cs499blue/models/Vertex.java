package cs499blue.models;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Vertex {
    Double x, y;

    public Vertex(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
