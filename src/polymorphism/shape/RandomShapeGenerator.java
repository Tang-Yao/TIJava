package polymorphism.shape;

import java.util.Random;

/**
 * Created by Administrator on 2016/10/10.
 */
public class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
