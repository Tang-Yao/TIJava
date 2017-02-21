package arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2017/1/3.
 */
public class ComType implements Comparable<ComType> {
    int i;
    int j;
    private static int count = 1;
    public ComType(int n1, int n2) {
        i = n1;
        j = n2;
    }

    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }

        return result;
    }

    public int compareTo(ComType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));

    }

    private static Random r = new Random(47);
    public static Generator<ComType> generator() {
        return new Generator<ComType>() {
            @Override
            public ComType next() {
                return new ComType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        ComType[] a = Generated.array(new ComType[12], generator());
        print("before sorting: ");
        print(Arrays.toString(a));
        Arrays.sort(a);
        print("after sorting: ");
        print(Arrays.toString(a));
    }
}
