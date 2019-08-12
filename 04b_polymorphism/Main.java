public class Main
{
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Puma puma = new Puma();

        cat.greet(dog);   // Cat.greet(Animal)
        cat.greet(cat);   // Cat.greet(Cat)
        cat.greet(puma);  // Cat.greet(Cat)

        puma.greet(dog);  // Puma.greet(Animal)
        puma.greet(puma); // Puma.greet(Cat) inherited from Cat.greet(Cat)

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Puma();

        // Animal.greet(Animal), at runtime, Puma.greet(Animal)
        animal3.greet(animal2);

        // Animal.greet(Animal), at runtime, Cat.greet(Animal)
        animal1.greet(animal2);

        // Animal.greet(Animal), at runtime, Cat.greet(Animal)
        // NOTE: By the time the JVM realizes that Cat.greet(Cat) exists, the
        //       compiler has irrevocably decided to call Cat.greet(Animal).
        animal1.greet(animal3);

        // Animal.greet(Animal), at runtime, Cat.greet(Animal)
        animal1.greet((Puma)animal3);

        // Cat.greet(Animal), at runtime, Cat.greet(Animal)
        ((Cat)animal1).greet(animal3);

        // Cat.greet(Cat), at runtime, Cat.greet(Cat)
        ((Cat)animal1).greet((Puma)animal3);

        // Cat.greet(Cat, Cat)
        cat.greet(cat, cat);

        // Puma.greet(Animal, Cat) inherited from Cat.greet(Animal Cat)
        puma.greet(dog, cat);

        // This fails to compile. Both Cat.greet(Cat, Cat) and
        // Cat.greet(Animal, Puma) are equally good matches.
        // cat.greet(cat, puma);
    }
}
