package strings;

import java.util.*;
/**
 * Created by ty on 2016/9/27.
 */
public class Splitting {
    public static String knights =
            "then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring";

    private static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}
