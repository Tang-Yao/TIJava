package myself;

/**
 * Created by Administrator on 2016/11/2.
 */
public class Demo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i  =0; i < 9; i++) {
            if (i == 3){
                sum = 0;
            } else
            	sum = sum + i;
        }
        System.out.println("Demo");
        System.out.println(sum);
        System.out.println("Hello world");
    }
}
