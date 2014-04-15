package cs499blue.algorithms;

import cs499blue.models.Edge;
import cs499blue.models.Vertex;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Distance {

    //returns the distance from a to b
    public static Double distanceFrom(Vertex a, Vertex b) {
        
        return Math.sqrt(Math.pow((a.getX()-b.getX()),2) + Math.pow((a.getY() - b.getY()),2));
    }
    

    //returns the length of e
    public static Double lengthOf(Edge e) {
        return distanceFrom(e.getA(), e.getB());
    }
}
