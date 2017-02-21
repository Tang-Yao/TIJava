package holding;

import java.util.*;
/**
 * Created by Administrator on 2016/9/22.
 */
public class ForEachCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Take the lang way home".split(" "));

        for(String s : cs) {
            System.out.print("'" + s + "'");
        }
    }
}
