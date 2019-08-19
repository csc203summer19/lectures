public class Circle implements Cloneable
{
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle(" + center + ", " + radius + ")";
    }

    public Circle clone() throws CloneNotSupportedException {
        // Don't call the default inherited clone method; we need to perform a
        //  deep copy. Note that Point already knows how to clone itself.
        return new Circle(center.clone(), radius);
    }
}
