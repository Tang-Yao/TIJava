package polymorphism;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String [] args) {
        Shape[] s= new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shp : s) {
            shp.draw();
        }
    }
}
