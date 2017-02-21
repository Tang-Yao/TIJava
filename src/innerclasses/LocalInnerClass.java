package innerclasses;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by ty on 2016/11/2.
 */

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                print("LocalCounter");
            }
            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                print("Counter");
            }
            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("LocalInner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++)
            print(c1.next());

        for (int i = 0; i < 5; i++)
            print(c2.next());
    }
}
