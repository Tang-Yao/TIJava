package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Circle extends Shape {
    public void draw() { print("Circle.draw()"); }
    public void erase() { print("Circle.erase()"); }
}
