package generics;

import java.util.ArrayList;

/**
 * Created by ty on 2016/9/29.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);
    }
}
