package innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/12.
 */
public class DotThis {
    void f() { print("DotThis.f()"); }

    public class Inner {
        public void f() { print("Inner.f()"); }

        public DotThis Outer() { return DotThis.this; }
    }

    public Inner inner() { return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.Outer().f();
        dt.inner().f();
    }
}
