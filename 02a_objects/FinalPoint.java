/**
 * Defines a point on the Cartesian plane.
 */

public class FinalPoint
{
    // These fields may not be changed once they are initialized.
    public final int x, y;

    // The convention for constants is to use all-caps.
    // Since it shouldn't change, we make it final.
    // Since it can't change, it's fine if everyone shares the same field.
    public static final double PI = 3.14159265;

    public FinalPoint(int x, int y) {
        // The fields may not be changed after this:
        this.x = x;
        this.y = y;
    }

    // This fails to compile -- x cannot be modified.
    // public void setX(int x) {
    //     this.x = x;
    // }
}
