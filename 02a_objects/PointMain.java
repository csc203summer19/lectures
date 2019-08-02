public class PointMain
{
    public static void main(String args[]) {
        // This declares a Point reference but does *not* create a
        //  Point object.
        Point pt;

        // This actually instantiates a Point object.
        pt = new Point(1, 2);

        // This declares and instantiates a Point.
        Point pt2 = new Point(3, 4);

        System.out.println("    " + pt.x);

        
        PrivatePoint pt3 = new PrivatePoint(5, 6);

        // This fails; the x attribute is private.
        // System.out.println("    " + pt3.x);
        System.out.println("    " + pt3.getX());

        // This succeeds; the x attribute in Point is public.
        pt.x = 7;
        // This fails; the x attribute in PrivatePoint is private.
        // pt3.x = 8;
        pt3.setX(8);

        System.out.println("    " + pt.x);
        System.out.println("    " + pt3.getX());


        StaticPoint pt4 = new StaticPoint(9, 10);
        System.out.println("    " + pt4.x);

        // This also modifies pt4, because pt5 and pt4 share fields.
        StaticPoint pt5 = new StaticPoint(11, 12);
        System.out.println("    " + pt4.x);

        // This makes no sense -- which Point does this refer to? We can
        //  potentially have multiple Points in this program. In order to
        //  access a field or method, you must have a reference to an
        //  object.
        // System.out.println("    " + Point.x);

        // This is unambiguous -- there may be multiple StaticPoints, but
        //  they all share the same 'x' field.
        System.out.println("    " + StaticPoint.x);        
        
        // This also makes no sense -- which PrivatePoint are we referring
        //  to? We need a reference to call the method.
        // PrivatePoint.getX();
        
        // This, again, is unambiguous.
        StaticPoint.foo();


        // The object-oriented style:
        ObjectPoint pt6 = new ObjectPoint(3, 4);
        System.out.println("    " + pt6.getRadius());

        // The non-object-oriented style -- this is antithetical to Java:
        StructurePoint pt7 = new StructurePoint(3, 4);
        System.out.println("    " + StructurePoint.getRadius(pt7));


        FinalPoint pt8 = new FinalPoint(13, 14);
        System.out.println("    " + pt8.x);

        // This fails to compile -- x cannot be changed.
        // pt8.x = 15;


        Point pt9 = new Point(1, 2);
        Point pt10 = new Point(1, 2);
        // This is false -- pt9 and pt10 do not refer to the same object.
        System.out.println("    " + (pt9 == pt10));
        Point pt11 = pt9;
        // This is true -- pt9 and pt10 do refer to the same object.
        System.out.println("    " + (pt9 == pt11));
    }
}
