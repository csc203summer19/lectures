public class Main
{
    // We do not need to declare CustomException with "throws" here; all of
    //  them are handled by try...catch blocks.
    public static void main(String[] args) {
        // throw new RuntimeException("Goodbye, world!");
        
        try {
            foo(true);
        }
        // This fails to compile: subtypes must be caught before supertypes.
        // catch (RuntimeException e) {}
        catch (CustomException e) {
            System.out.println(e);
            System.out.println("    You are not allowed to quit 203 yet.");
        }
        catch (RuntimeException e) {
            System.out.println("Catching RuntimeException...");
        }
        finally {
            System.out.println("finally...");
        }

        System.out.println("Continuing...");

        try {
            System.out.println(5 / 0);
            foo(true);
        }
        // This catch does not match; division by zero produces an
        //  ArithmeticException.
        catch (CustomException e) {}
        finally {
            System.out.println("finally...");
        }
    }

    // This method will not handle CustomExceptions, so it must declare
    //  them using the "throws" keyword.
    public static void foo(boolean p)
            throws CustomException {
        if (p) {
            // This exception will propagate up to the caller, main.
            throw new CustomException();
        }
        else {
            throw new RuntimeException();
        }
    }
}
