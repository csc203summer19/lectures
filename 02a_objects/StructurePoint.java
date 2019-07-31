/**
 * Defines a point on the Cartesian plane.
 */

public class StructurePoint
{
    public int x, y;

    public StructurePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getRadius(StructurePoint pt) {
        return Math.sqrt(Math.pow(pt.x, 2) + Math.pow(pt.y, 2));
    }
}
