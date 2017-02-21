package reusing;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/10.
 */

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() { print("Cartoon constructor"); }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
