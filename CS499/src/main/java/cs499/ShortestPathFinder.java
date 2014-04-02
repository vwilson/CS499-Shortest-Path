package cs499;

import cs499.model.Graph;
import cs499.model.Obstacle;
import cs499.model.Vertex;

import java.util.ArrayList;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class ShortestPathFinder {

    private ArrayList<Obstacle> obstacles;

    private Graph theGraph;

    private Vertex source;
    private Vertex dest;

    public ShortestPathFinder() {
        obstacles = new ArrayList<>();
        theGraph = new Graph();
    }

    //loads obstacles from file, populates the arraylist 'obstacles'
    public void loadObstaclesFromFile(String filename) {
        //...
    }

    //generates graph by analyzing source, dest, and obstacles
    public void generateGraph() {
        theGraph = new Graph();
        //..
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getSource() {
        return source;
    }
}
