package cs499;

import cs499.algorithms.Dijkstra;
import cs499.models.Graph;
import cs499.models.Path;
import cs499.models.Vertex;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class ShortestPathDriver {

    private static Vertex dest;

    public static void main(String[] args) {

        if (args.length < 2) {
            printUsage();
        }

        ShortestPathFinder shortestPathFinder = new ShortestPathFinder();

        shortestPathFinder.loadObstaclesFromFile(args[1]);

        Vertex source = getSource();
        shortestPathFinder.setSource(source);

        Vertex dest = getDest();
        shortestPathFinder.setDest(dest);

        Graph g = shortestPathFinder.generateGraph();

        Path shortestPath = Dijkstra.shortestPath(g, source, dest);

        for (Vertex v : shortestPath) {
            System.out.println("Step: " + v);
        }

    }

    private static void printUsage() {
        throw new UnsupportedOperationException("Not Yet Implemented");

    }

    public static Vertex getSource() {
        //prompt user for input
        double x = 0d, y = 0d;
        throw new UnsupportedOperationException("Not Yet Implemented");


        //Vertex source = new Vertex(x,y);
        //return source;
    }

    public static Vertex getDest() {
        //prompt user for input
        double x = 0d, y = 0d;
        throw new UnsupportedOperationException("Not Yet Implemented");


        //Vertex dest = new Vertex(x,y);
        //return dest;
    }
}
