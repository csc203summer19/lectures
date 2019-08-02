public class Circle
{
    // If the Circle contains both the coordinates and the radius, there are
    //  multiple reasons to change the code.
    // private int x, y;
    
    // If we wanted to switch to polar coordinates, none of the code in this
    //  class has to change.
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
}
