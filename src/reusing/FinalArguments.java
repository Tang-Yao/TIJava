package reusing;

/**
 * Created by Administrator on 2016/10/10.
 */

class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    void with(final Gizmo g) {

    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null);
    }
}
