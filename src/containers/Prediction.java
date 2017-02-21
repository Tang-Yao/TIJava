package containers;

import java.util.Random;

/**
 * Created by noto on 2017/1/3.
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;
    public String toString() {
        if (shadow)
            return "six more weeks winter";
        else
            return "Early Spring";
    }
}
