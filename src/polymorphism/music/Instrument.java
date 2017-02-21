package polymorphism.music;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/10.
 */
class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }

    public void fatherDemo(Note n) {
        print("Instrument.fatherDemo() " + n);
    }
}
