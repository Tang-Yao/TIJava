package generics;

import net.mindview.util.*;

/**
 * Created by ty on 2016/9/29.
 */
public class BasiceGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
