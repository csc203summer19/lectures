public class Main
{
    public static void main(String[] args) {
        Triple<Integer, Integer, Integer> triple = new Triple<>(1, 2, 3);
        System.out.println("    " + triple.first);
        System.out.println("    " + triple.second);
        System.out.println("    " + triple.third);

        Triple<String, Integer, Boolean> triple2 = new Triple<>("foo", 5, true);
        System.out.println("    " + triple2.first);
        System.out.println("    " + triple2.second);
        System.out.println("    " + triple2.third);

        Pair<String, Integer> pair = triple2;
        System.out.println("    " + pair.first);
        System.out.println("    " + pair.second);
        // This works, but it generates warnings:
        System.out.println("    " + ((Triple<String, Integer, Boolean>)pair).third);

        PairPairedWithAnInteger<String> pair2 =
                new PairPairedWithAnInteger<>("bar", 94);
        System.out.println("    " + pair2.first);
        System.out.println("    " + pair2.second);

        Node<String> list = 
            new Node<>("foo", new Node<>("bar", new Node<>("bay", null)));

        System.out.println("    " + list.getValue());
        System.out.println("    " + list.getNext().getValue());
        System.out.println("    " + list.getNext().getNext().getValue());
        System.out.println("    " + list.getNext().getNext().getNext());
    }
}
