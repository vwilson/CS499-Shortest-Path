package cs499blue.models;

import cs499blue.algorithms.Distance;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (!a.equals(edge.a)) return false;
        if (!b.equals(edge.b)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + b.hashCode();
        return result;
    }
}
