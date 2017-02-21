package generics;

/**
 * Created by ty on 2016/9/29.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }

    public String toString() {
        return "CountedObject " + id;
    }
}
