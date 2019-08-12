public class Cat implements Animal
{
    public void greet(Animal other) {
        System.out.println("    Meow!");
    }

    public void greet(Cat other) {
        System.out.println("    Hiss!");
    }

    public void greet(Cat other1, Cat other2) {
        System.out.println("    Purr!");
    }

    public void greet(Animal other1, Cat other2) {
        System.out.println("    ...");
    }

    public void greet(Animal other1, Puma other2) {
        System.out.println("    ???");
    }
}
