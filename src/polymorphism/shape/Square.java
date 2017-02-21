package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Square extends Shape {
    public void draw() { print("Square.draw()"); }
    public void erase() { print("Square.erase()"); }
}
