public class Main
{
    public static void main(String[] args) {
        for (char c : new IterableString("Hello, world!")) {
            System.out.println("    " + c);
        }
    }
}
