package initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ty on 2016/10/10.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a is " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
