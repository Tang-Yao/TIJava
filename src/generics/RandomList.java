package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ty on 2016/9/29.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random();
    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();

        for (String s : ("The quick browm fox jumped over " + "the lazy brwm dog").split(" "))
            rs.add(s);

        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }
    }

}
