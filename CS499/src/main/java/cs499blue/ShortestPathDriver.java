package cs499blue;

import cs499blue.algorithms.Dijkstra;
import cs499blue.models.Graph;
import cs499blue.models.Path;
import cs499blue.models.Vertex;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class ShortestPathDriver {

    private static Vertex dest;

    public static void main(String[] args) {

        if (args.length < 2) {
            printUsage();
            System.exit(1);
        }

        ShortestPathFinder shortestPathFinder = new ShortestPathFinder();

        shortestPathFinder.loadObstaclesFromFile(args[1]);

        Vertex source = getSource();
        shortestPathFinder.setSource(source);

        Vertex dest = getDest();
        shortestPathFinder.setDest(dest);

        Graph g = shortestPathFinder.generateGraph();

        Path shortestPath = Dijkstra.shortestPath(g, source, dest);

        System.out.println(shortestPath);
    }

    private static void printUsage() {
        System.out.println("Usage: $java -jar CS499-Blue-Shortest-Path.jar filename.obj");
    }

    //prompt user for input
    public static Vertex getSource() {
        Double x = 0d, y = 0d;
        throw new UnsupportedOperationException("Will Never Be Implemented");


        //Vertex source = new Vertex(x,y);
        //return source;
    }

    //prompt user for input
    public static Vertex getDest() {
        Double x = 0d, y = 0d;
        throw new UnsupportedOperationException("Will Never Be Implemented");


        //Vertex dest = new Vertex(x,y);
        //return dest;
    }
}
