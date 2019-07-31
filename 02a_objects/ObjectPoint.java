/**
 * Defines a point on the Cartesian plane.
 */

public class ObjectPoint
{
    private int x, y;

    public ObjectPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /**
     * Compute the distance from the origin.
     */
    public double getRadius() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
