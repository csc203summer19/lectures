/**
 * Represents a point on the Cartesian plane.
 */

public class Point implements Comparable<Point>
{
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    /**
     * The natural ordering of Points is by x-coordinate, ascending.
     */
    public int compareTo(Point other) {
        if (this.x < other.x) {
            return -1;
        }
        else if (this.x == other.x) {
            return 0;
        }
        else {
            return 1;
        }

        // NOTE: Alternatively, we could have just allowed the doubles
        //       to compare themselves.
        // return ((Double)(this.x)).compareTo(other.x);

        // NOTE: This will not work because we have to return an int.
        // return this.x - other.x;

        // NOTE: This will also not work if the difference is in (0, 1).
        // return (int)(this.x - other.x);
    }
}
