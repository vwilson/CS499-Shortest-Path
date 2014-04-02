package cs499.model;

import java.util.HashSet;
import java.util.Set;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Graph {
    private Set<Edge> edges;
    private Set<Vertex> vertices;

    public Graph() {
        edges = new HashSet<>();
        vertices = new HashSet<>();
    }

    //adds a vertex to the set of vertices
    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    //adds an edge to the set of edges.
    // if an edge's vertex is not contained in vertices, blow up
    public void addEdge(Edge e) {
        if (!edges.contains(e.getA()) || !edges.contains(e.getB())) {
            throw new IllegalStateException("Unknown Vertex");
        }

        edges.add(e);
    }

    public boolean isConnected(Vertex a, Vertex B) {
        return false;
    }
}
