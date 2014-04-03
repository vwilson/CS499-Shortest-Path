package cs499blue.models;

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

    public void AddNextVertex(Vertex v) {
        thePath.add(v);
    }

    @Override
    public Iterator<Vertex> iterator() {
        return thePath.iterator();
    }
}
