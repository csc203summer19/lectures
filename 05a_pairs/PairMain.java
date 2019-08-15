public class PairMain
{
    public static void main(String[] args) {
        Pair pair1 = new Pair(1, 2);
        Pair pair2 = new Pair("foo", "bar");
        Pair pair3 = new Pair(3.0, pair2);

        // This fails to compile. The compile-time types are Object, and
        //  Objects cannot be added.
        // System.out.println(pair1.second + pair3.first);
        System.out.println((Integer)(pair1.second) + (Double)(pair3.first));

        // This clearly doesn't work, but because the compile-time types are
        //  Object, the compiler cannot detect the error.
        System.out.println((Integer)(pair2.second) + (Double)(pair3.first));
    }
}
