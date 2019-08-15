public class PairMain
{
    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(1, 2);
        Pair<String, String> pair2 = new Pair<String, String>("foo", "bar");
        Pair<Double, Pair<String, String>> pair3 =
                new Pair<Double, Pair<String, String>>(3.0, pair2);

        // The compiler does not require any casting, because it knows that
        //  pair1 contains only Integers.
        System.out.println(pair1.second + pair3.first);

        // The compiler can detect this error, because it knows that pair2
        //  contains only Strings.
        // System.out.println((Integer)(pair2.second) + (Double)(pair3.first));

        // We can still create pairs that can contain anything and everything
        //  if we really want to:
        Pair<Object, Object> pair4 = new Pair<Object, Object>(null, null);
    }
}
