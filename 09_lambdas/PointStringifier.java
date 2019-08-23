/**
 * Tells the compiler how to interpret a lambda expression: what sort of
 *  class in which to encapsulate it and how it may be called.
 */

@FunctionalInterface
public interface PointStringifier
{
    String stringify(Point pt);
}
