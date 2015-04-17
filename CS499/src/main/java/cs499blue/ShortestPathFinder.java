package cs499blue;

import cs499blue.models.Graph;
import cs499blue.models.Obstacle;
import cs499blue.models.Vertex;

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
        throw new UnsupportedOperationException("Will Never Be Implemented");
    }


    //generates graph by analyzing source, dest, and obstacles
    //this is the meat and potatoes of the program.
    public Graph generateGraph() {
        theGraph = new Graph();

        throw new UnsupportedOperationException("Will Never Be Implemented");

        //return theGraph;
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
