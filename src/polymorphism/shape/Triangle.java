package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Triangle extends Shape {
    public void draw() { print("Trianle.draw()"); }
    public void erase() { print("Triangle.erase()"); }
}
