package exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/11/3.
 */
public class MultipleReturns {
    public static void f(int i) {
        print("Initialization that requires cleanup");
        try {
            print("Point1");
            if (i == 1) return;
            print("Point2");
            if (i == 2) return;
            print("Point3");
            if (i == 3) return;
            print("End");
            return;
        } finally {
            print("Performing cleanup");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++)
            f(i);
    }
}
