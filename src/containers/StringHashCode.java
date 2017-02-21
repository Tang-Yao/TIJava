package containers;

/**
 * Created by ty on 2017/1/4.
 */
public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
        Integer it = new Integer(11);
        //int ints = 11;
        System.out.println(it.hashCode());
        //System.out.println();
    }
}
