package initialization;

/**
 * Created by ty on 2016/10/8.
 */

class Rock {
    Rock() {
        System.out.println("Rock");
    }
}


public class SimpleContractor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
