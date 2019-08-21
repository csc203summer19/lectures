/**
 * Iterates over strings.
 */

import java.util.Iterator;

public class StringIterator implements Iterator<Character>
{
    // The raw string we're iterating over:
    private String rawString;
    // Where we are in the string:
    private int index;

    public StringIterator(String rawString) {
        this.rawString = rawString;
        this.index = 0;
    }

    /**
     * Checks to see if there are more characters in the string.
     */
    public boolean hasNext() {
        return index < rawString.length();
    }

    /**
     * Retrive the next character from the string.
     */
    public Character next() {
        return rawString.charAt(index++);
    }
}
