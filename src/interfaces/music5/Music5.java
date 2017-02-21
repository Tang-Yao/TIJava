package interfaces.music5;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() { return "Wind"; }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() { return "Percussion"; }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() { return "Stringed"; }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {
    static void tune(Instrument i) { i.play(Note.MIDDLE_C); }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
