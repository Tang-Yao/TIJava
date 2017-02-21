package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/11.
 */

class Super {
    public int field = 0;
    public int getField() { return field; }
}

class Sub extends Super {
    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.field; }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        print("Sup.field = " + sup.field + ", sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        print("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + " sub.getSuperField() = " + sub.getSuperField());
    }
}
