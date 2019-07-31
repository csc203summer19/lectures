/**
 * Defines a point on the Cartesian plane.
 */

public class StaticPoint
{
    // These fields are shared by all instances, and they can be accessed
    //  without a reference to an object.
    public static int x, y;

    public StaticPoint(int x, int y) {
        // The fields are accessible here:
        this.x = x;
        this.y = y;
    }

    public static void foo() {
        System.out.println("Inside StaticPoint.");
    }
}
