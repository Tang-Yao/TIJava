package generics;

/**
 * Created by ty on 2016/9/29.
 */
class ReturnGenericType<T extends HasF> {
    private T obj;
    public ReturnGenericType(T x) { obj = x; }
    public T get() { return obj; }
}
