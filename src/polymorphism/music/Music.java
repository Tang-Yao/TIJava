package polymorphism.music;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
/*        Instrument flute2 = new Wind();
        flute2.play(Note.B_FLAT);
        flute2.fatherDemo(Note.C_SHARP);*/
    }
}
