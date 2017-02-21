package innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/12.
 */
public class Parcel1 {
    class Contens {
        private int i = 11;
        public int value() { return i; }
    }

    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }

    public void ship(String dest) {
        Contens c= new Contens();
        Destination d = new Destination(dest);
        print(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
