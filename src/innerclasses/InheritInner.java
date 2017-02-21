package innerclasses;

/**
 * Created by ty on 2016/11/2.
 */

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}























