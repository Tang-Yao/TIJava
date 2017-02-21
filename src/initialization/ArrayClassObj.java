package initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/10.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] a = new Integer[rand.nextInt(20)];

        print("length of a = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(200);

        print(Arrays.toString(a));
    }

}
