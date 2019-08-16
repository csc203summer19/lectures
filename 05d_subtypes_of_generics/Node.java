public class Node<T> extends Pair<T, Node<T>>
{
    public Node(T value, Node<T> next) {
        super(value, next);
    }

    public T getValue() {
        return first;
    }

    public Node<T> getNext() {
        return second;
    }
}
