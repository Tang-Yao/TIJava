package interfaces.interfaceprocessor;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
