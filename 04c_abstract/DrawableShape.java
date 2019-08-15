import java.awt.Color;

// Groups functionality common to all drawable shapes without allowing the
//  idea of a drawable shape to be instantiated.
public abstract class DrawableShape implements Shape
{
    private Color color;

    public DrawableShape(Color color) {
        this.color = color;
    }

    // This functionality is common to all drawable shapes, and it should
    //  never be allowed to change.
    public final void setColor(Color color) {
        this.color = color;
    }

    // This functionality is required of all drawable shapes but not common
    //  to all drawable shapes.
    public abstract void draw();

    // NOTE: Even though DrawableShape implements Shape, it does not need to
    //       define area and perimeter -- a DrawableShape cannot be
    //       instantiated, so those requirements are transferred to any
    //       extending classes.
}
