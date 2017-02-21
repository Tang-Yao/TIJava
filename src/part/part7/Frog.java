package part.part7;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/10.
 */
class Amphibian {
    Amphibian change(Amphibian ap) {
        return ap;
    }

    void eat() {
        print("Amphibian's eat()");
    }

}

public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog fg = new Frog();
        Amphibian am = fg.change(fg);

    }

    void dispose() {
        print("Frog's dispose()");
    }

    void play() {
        print("Frog's play()");
    }

}
