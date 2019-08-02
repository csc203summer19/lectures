/**
 * Represents a point on the Cartesian plane.
 */

public class Point
{
    // Make fields private so that their values can be validated in
    //  "getter" and "setter" methods.
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Computes the distance of this point from the origin.
     */
    public double distance() {
        // return Math.sqrt(Math.pow(this.x, 2)
        //                  + Math.pow(this.y, 2));
        return distance(new Point(0, 0));
    }

    /**
     * Computes the distance of this point from another point.
     */
    public double distance(Point pt) {
        return Math.sqrt(Math.pow(this.x - pt.x, 2)
                         + Math.pow(this.y - pt.y, 2));
    }

    // The equals method can accept any other object of any type.
    public boolean equals(Object other) {
        // First, make sure the other reference is non-null.
        if (other == null) {
            return false;
        }
        // Then, make sure the other object is actually a Point.
        else if (!(this.getClass().equals(other.getClass()))) {
            return false;
        }
        // Finally, make sure the Points have the same coordinates.
        else {
            // We know that other must be a Point, but the compiler does not.
            Point pt = (Point)other;

            // "x" is private, but this method is in the Point class, so we
            //  still have access.
            // "x" is a primitive, so we can use "==".
            return this.x == pt.x && this.y == pt.y;
        }
    }

    public String toString() {
        // Java already knows how to stringify integers.
        return "Point(" + x + ", " + y + ")";
    }
}
