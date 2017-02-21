package holding;

import java.util.*;

/**
 * Created by ty on 2016/9/23.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for(T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String [] strings = {"A", "B", "C"};
        test(Arrays.asList(strings));
    }
}
