package cs499.model;

import cs499.algorithms.Distance;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Edge {
    private Vertex a, b;

    public Edge(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
    }

    public Vertex getA() {
        return a;
    }

    public Vertex getB() {
        return b;
    }

    public Double getWeight() {
        return Distance.distanceFrom(a, b);
    }
}
