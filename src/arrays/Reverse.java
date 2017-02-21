package arrays;

import net.mindview.util.Generated;

import java.util.Arrays;
import java.util.Collections;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2017/1/3.
 */
public class Reverse {
    public static void main(String[] args) {
        ComType[] a = Generated.array(new ComType[12], ComType.generator());
        print("before sorting: ");
        print(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        print("after sorting: ");
        print(Arrays.toString(a));
    }
}
