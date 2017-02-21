package initialization;

import static net.mindview.util.Print.print;

/**
 * Created by ty on 2016/10/10.
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        print("this burrito is ");
        switch (degree) {
            case NOT:
                print("not spicy at all.");
                break;
            case MILD:
                print("a little hot");
                break;
            case HOT:
                break;
            case FLAMING:
                break;
            default:
                print("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();

    }
}
