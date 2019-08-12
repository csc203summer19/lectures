public class Dog implements Animal
{
    // NOTE: If we do not define a constructor, we automatically get a
    //       constructor that takes no args and does nothing.

    public void greet(Animal other) {
        System.out.println("    Woof!");
    }
}
