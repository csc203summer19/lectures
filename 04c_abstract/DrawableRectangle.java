// DrawableRectangle extends DrawableShape, thus, it inherits all public
//  definitions in DrawableShape.
// DrawableRectangle extends DrawableShape, and DrawableShape implements
//  Shape, thus, DrawableRectangle must implement the Shape methods.

import java.awt.Point;
import java.awt.Color;

public class DrawableRectangle extends DrawableShape
{
    // DrawableRectangle is required to implement at least *three* methods:
    //  * area, because it implements Shape.
    //  * perimeter, because it implements Shape.
    //  * draw, because it extends DrawableShape, and draw is abstract.

    public DrawableRectangle(Point topLeft, Point bottomRight, Color color) {
        super(color);
    }
}
