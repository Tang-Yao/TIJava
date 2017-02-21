package algs.demo;

/**
 * Created by noto on 2017/1/3.
 */
public class Demo {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 0; j < 1000; j++) {
            i = i++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(i);
    }
}
