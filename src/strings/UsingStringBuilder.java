package strings;

import java.util.*;
/**
 * Created by ty on 2016/9/27.
 */
public class UsingStringBuilder {

    public static Random rand = new Random(47);
    public String toString() {
        StringBuffer result = new StringBuffer("[");
        for(int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }

        result.delete(result.length() - 2, result.length());
        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
