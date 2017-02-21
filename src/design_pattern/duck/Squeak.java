package design_pattern.duck;

/**
 * Created by ty on 2016/10/28.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
