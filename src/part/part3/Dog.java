package part.part3;

/**
 * Created by ty on 2016/10/8.
 */
public class Dog {
    String name;
    String says;

    Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("spot", "Ruff");
        Dog d2 = new Dog("scruffy", "Wurf");

        System.out.println(d1.name + " " + d1.says);
        System.out.println(d2.name + " " + d2.says);
    }
}
