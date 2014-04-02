package cs499;

import cs499.model.Vertex;

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

        ShortestPathFinder psf = new ShortestPathFinder();

        psf.loadObstaclesFromFile(args[1]);

        Vertex src = getSource();
        Vertex dest = getDest();
        psf.setSource(src);
        psf.setDest(dest);

        psf.generateGraph();


    }

    private static void printUsage() {

    }

    public static Vertex getSource() {
        //prompt user for input
        double x = 0d, y = 0d;
        //...

        Vertex source = new Vertex(x,y);
        return source;
    }

    public static Vertex getDest() {
        //prompt user for input
        double x = 0d, y = 0d;
        //...

        Vertex dest = new Vertex(x,y);
        return dest;
    }
}
