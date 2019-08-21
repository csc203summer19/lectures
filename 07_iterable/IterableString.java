/**
 * Makes strings iterable.
 */

import java.util.Iterator;

public class IterableString implements Iterable<Character>
{
    // The string wrapped up in this iterable string:
    private String rawString;

    public IterableString(String rawString) {
        this.rawString = rawString;
    }

    public Iterator<Character> iterator() {
        return new StringIterator(rawString);
    }
}
