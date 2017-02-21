package innerclasses;

/**
 * Created by ty on 2016/10/12.
 */
public class Wrapping {
    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
    public void test() { System.out.println("just a test"); }
}
