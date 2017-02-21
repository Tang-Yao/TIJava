package innerclasses;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Parcel9 {
    public Destination destinationd(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destinationd("Tasmania");
    }
}
