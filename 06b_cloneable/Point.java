/**
 * Represents a point on the Cartesian plane.
 */

public class Point implements Cloneable
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

    // Override clone to make it public and specify that it returns a Point.
    public Point clone() throws CloneNotSupportedException {
        // Call the default clone method, casting the result to a Point.
        return (Point)(super.clone());
    }
}
