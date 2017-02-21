package initialization;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/9.
 */

class Tree {
    int height;
    Tree() {
        print("Planting a seeding");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating a new tree that is " + height + " feet tall");
    }

    void info() {
        print("Tree is " + height + " feet tall");
    }

    void info(String s) {
        print(s + ": tree is " + height + " feet tall");
    }
}


public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }

        new Tree();
    }
}
