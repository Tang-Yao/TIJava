package typeinfo;

/**
 * Created by ty on 2016/11/15.
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
        System.out.println(intClass);
    }
}
