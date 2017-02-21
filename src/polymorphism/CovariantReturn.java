package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */

class Grain {
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() { return "Wheat"; }
}

class Mill {
    Grain process() { return new Grain(); }
}

class WheatMill extends Mill {
    Wheat process() { return new Wheat(); }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = new Grain();
        print(g);
        m = new WheatMill();
        g = m.process();
        print(g);
    }
}
