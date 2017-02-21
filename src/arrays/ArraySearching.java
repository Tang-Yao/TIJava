package arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2017/1/3.
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(100);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25],gen));
        Arrays.sort(a);
        print("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                print("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
                break;
            }
        }
    }
}
