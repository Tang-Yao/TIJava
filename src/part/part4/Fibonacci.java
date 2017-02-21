package part.part4;

import java.util.Random;

/**
 * Created by ty on 2016/10/8.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(30);
        System.out.println(number);
        Integer[] count = new Integer[number];
        count[0] = 1;
        count[1] = 1;

        for (int i = 2; i < number; i++) {
            count[i] = count[i - 1] + count[i -2];
        }


        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
