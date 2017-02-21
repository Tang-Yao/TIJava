package innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/11/2.
 */

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() { print("Egg.Yolk"); }
    }

    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg {
    public class Yolk {
        public Yolk() { print("BigEgg.Yolk"); }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
