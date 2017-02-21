package part.part8;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */
class DemoA {
    void play() { print("DemoA.play()"); }

    DemoA() {
        print("DemoA()");
        play();
    }
}
public class ExtendsDemo extends DemoA {

    void play() { print("ExtendsDemo.play()"); }
    ExtendsDemo() { print("ExtendsDemo()"); }

    public static void main(String[] args) {

        new ExtendsDemo();
        new DemoA();
    }
}
