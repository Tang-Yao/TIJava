package arrays;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2017/1/3.
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        print("i = " + Arrays.toString(i));
        print("j = " + Arrays.toString(j));

        System.arraycopy(i, 0, j, 0, i.length);
        print("j = " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k, 103);
    }
}
