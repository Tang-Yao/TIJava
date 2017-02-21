package innerclasses;

/**
 * Created by ty on 2016/10/12.
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                System.out.println("Parcel8 test");
                super.test();
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(8);
        System.out.println("Main");
    }
}
