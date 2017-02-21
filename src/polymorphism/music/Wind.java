package polymorphism.music;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public void sonDemo(Note n) {
        print("Wind.sonDemo() " + n);
    }
}
