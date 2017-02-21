package holding;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by ty on 2016/9/21.
 */
public class UniqueWords {
    public static void main(String [] args) {
        Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
