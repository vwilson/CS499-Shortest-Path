package cs499.models;

import java.util.ArrayList;

/**
 * author: vwilson
 * date: 4/1/14
 */

//a polygonal obstacle
public class Obstacle {

    private ArrayList<Vertex> vertices;

    public Obstacle() {
        vertices = new ArrayList<>();
    }

    public Vertex getVertex(int index) {
        return vertices.get(index);
    }

    //adds a vertex to the shape.
    //***VERTICES MUST BE ADDED IN COUNTER-CLOCKWISE ORDER***
    public void addVertex(Vertex v) {
        vertices.add(v);
    }
}
