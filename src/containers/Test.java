package containers;

/**
 * Created by ty on 2017/1/4.
 */
public abstract class Test<C> {
    String name;
    public Test(String name) { this.name = name; }
    abstract int test(C container, TestParam tp);
}
