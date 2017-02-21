package strings;

import static myself.Print.print;
/**
 * Created by ty on 2016/9/26.
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        String qq = upcase(q);
        print(q);
        print(qq);
    }
}
