package algs.demo;

/**
 * Created by noto on 2017/1/3.
 */
public class Demo {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for (int j = 0; j < 1000; j++) {
            i = i++;
            //System.out.print(i + " ");
        }
        for (int begin = 0; begin < 100; begin++) {
            sum = sum + begin;
        }
        System.out.println(sum);
        System.out.println(i);
    }
}
