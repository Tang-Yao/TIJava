package holding;


import java.util.Iterator;

/**
 * Created by ty on 2016/9/23.
 */
public class IterableClass implements Iterable<String> {

    protected String [] words = ("And that is now " +
        "we know the earth to be banana-shaped").split(" ");

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String [] args) {
        for(String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }


}
