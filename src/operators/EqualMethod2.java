package operators;

/**
 * Created by ty on 2016/10/8.
 */
class Value {
    int i;
}

public class EqualMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
