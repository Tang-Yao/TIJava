package operators;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/8.
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i);
        print("i++ : " + i++);
        print(i);
    }
}
