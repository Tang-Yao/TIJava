package reusing;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/10.
 */

class Game {
    Game(int i) {
        print("Game Constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
    }
}
public class Chess {
}
