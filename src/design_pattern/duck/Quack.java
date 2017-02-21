package design_pattern.duck;

/**
 * Created by ty on 2016/10/28.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
