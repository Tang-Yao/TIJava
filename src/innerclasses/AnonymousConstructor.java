package innerclasses;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/12.
 */

abstract class Base {
    public Base(int i) { print("Base Constructor"); }

    public abstract void f();
}



public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                print("Inside instance initializer");
            }

            @Override
            public void f() {
                print("In anoymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
