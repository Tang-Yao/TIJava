package part.part5;

/**
 * Created by ty on 2016/10/9.
 */
public class Tank {
    static boolean state = false;

    protected void finalize() {
        state = true;
    }

    public static void main(String[] args) {
        Tank t = new Tank();
        System.gc();
        System.out.println(state);
    }
}
