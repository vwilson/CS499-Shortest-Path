package cs499blue.models;

import cs499blue.algorithms.Distance;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Path implements Iterable<Vertex> {
    private ArrayList<Vertex> thePath;

    public Path() {
        thePath = new ArrayList<>();
    }

    public void addNextVertex(Vertex v) {
        thePath.add(v);
    }

    public Double getLength() {
        Double accumulator = 0d;
        for (int i = 0; i < thePath.size() - 1; i++) {
            accumulator += Distance.distanceFrom(thePath.get(i), thePath.get(i + 1));
        }
        return accumulator;
    }

    @Override
    public Iterator<Vertex> iterator() {
        return thePath.iterator();
    }

    @Override
    public String toString() {
        StringBuilder ts = new StringBuilder("Shortest Path:\n");

        for (Vertex v : thePath) {
            ts.append(v + "\n");
        }

        ts.append("Final Distance: ");
        ts.append(getLength());

        return ts.toString();
    }
}
