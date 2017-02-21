package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
}

public class PrivateOverride {
    private void f() { print("private f()"); }

    public static void main(String[] args) {
        PrivateOverride po = new PrivateOverride();
        po.f();
        Derived po1 = new Derived();
        po1.f();
    }
}
