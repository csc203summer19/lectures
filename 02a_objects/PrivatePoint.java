/**
 * Defines a point on the Cartesian plane.
 */

// This makes no sense; this class would only be able to be instantiated
//  by itself.
// private class PrivatePoint
public class PrivatePoint
{
    // These fields may only be accessed within this class:
    private int x, y;

    public PrivatePoint(int x, int y) {
        // The fields are accessible here:
        this.x = x;
        this.y = y;
    }

    // This getter method retrieves the x-coordinate:
    public int getX() {
        // The "this" is optional; there is only one 'x'.
        return x;
    }

    // This setter method modifies the x-coordinate:
    public void setX(int x) {
        // The "this" is required; there are multiple 'x's.
        // If you don't want to allow negative values of 'x', that can be
        //  verified here. Since the field is private, it cannot be modified
        //  without going through this check.
        if (x >= 0) {
            this.x = x;
        }
    }
}
