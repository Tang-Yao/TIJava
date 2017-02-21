package typeinfo;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/11/16.
 */

class Base {}

class Derived extends Base {}

public class FamilyVsExactType {
    static void test(Object x) {
        print("Testing x of type" + x.getClass());
        print("x instanceof Base " + (x instanceof Base));
        print("x instanceof Derived " + (x instanceof Derived));
        print("Base.instanceof(x) " + Base.class.isInstance(x));
        print("Derived.isInstance(x) " + Derived.class.isInstance(x));
        print("x.getClass() == Base.class " + (x.getClass() == Base.class));
        print("x.getClass() == Dervied.class " + (x.getClass() == Derived.class));
        print("x.getClass().equals(Base.class) " + (x.getClass().equals(Base.class)));
        print("x.getClass().equals(Dervied.class)" + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}
