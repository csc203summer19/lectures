/**
 * Demonstrates introductory features of Java.
 */

public class HelloJava
{
    public static void main(String args[]) {
        // All of these are equivalent:
        System.out.println("Five: " + 5);
        System.out.print("Five: " + 5 + "\n");
        System.out.printf("Five: %d\n", 5);

        // Declare some variables:
        int x = 5;
        char c = 'a';
        String str = "foo";

        // Convert/cast types:
        x = (int)5.2;
        System.out.println("    " + x);
        x = (int)'a';
        System.out.println("    " + x);

        // This only declares the array, it doesn't initialize it:
        int[] arr;
        // This actually initializes the array:
        arr = new int[5];
        System.out.println("    " + arr[0]);

        System.out.println("Initial x: " + x);
        // Post-increment:
        System.out.println("x: " + x++);
        // Pre-increment:
        System.out.println("x: " + ++x);

        // A conditional with block scope:
        if (x < 100) {
            int y = 10;     // This declares 'y' local to this block.
            x = 101;        // This modifies the 'x' outside this block.
        }
        else {
            x = 99;
        }

        // System.out.println(y); // This fails -- 'y' is not defined.
        System.out.println("    " + x);

        // A "while" loop:
        int i = 0;
        while (i < 10) {
            System.out.println("    " + i);
            i++;
        }

        // A "do...while" loop -- the body is guaranteed to run at least once.
        do {
            System.out.println("Inside the do...while.");
        } while (i < -743);

        // A "for" loop.
        for (int j = 0; j < 5; j++) {
            arr[j] = 2 * j;
        }

        // A "foreach" loop.
        for (int element : arr) {
            // Note that we don't know the index of the element here.
            System.out.println("    " + element);
        }
    }
}
