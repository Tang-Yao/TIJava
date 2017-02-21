package typeinfo;

/**
 * Created by ty on 2016/11/16.
 */
public class BoundClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        System.out.println(bounded);

        bounded = double.class;
        System.out.println(bounded);

        bounded = Number.class;
        System.out.println(bounded);
    }
}
