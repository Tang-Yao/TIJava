package generics;

/**
 * Created by ty on 2016/9/30.
 */

interface FactoryI<T> {
    T create() ;
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    public Integer create() {
        return new Integer(0);
    }
}

class Widge {
    public static class Factory implements FactoryI<Widge> {
        public Widge create() {
            return new Widge();
        }
    }
}

public class FactoryContraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widge>(new Widge.Factory());
    }
}
