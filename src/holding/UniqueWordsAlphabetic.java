package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/11/2.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("F:\\JAVA\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
