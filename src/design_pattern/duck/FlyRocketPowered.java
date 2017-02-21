package design_pattern.duck;

/**
 * Created by ty on 2016/10/28.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket.");
    }
}
