package myself;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ty on 2017/1/10.
 */
public class SerialNumber {
    long number = getOrderNo();
    static long count = 0;

    public SerialNumber(long count) {
        number = number + count;
    }
    public static void main(String[] args) {
        /*
        long No = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDate = sdf.format(new Date());
        No = Long.parseLong(nowDate) * 1000;
        System.out.println(No);
        */
        for (int i = 0; i < 100; i++ ) {
            count = count + 1;
            SerialNumber sn = new SerialNumber(count);
            System.out.println(sn.number);
        }
    }

    public static long getOrderNo() {
        long No = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDate = sdf.format(new Date());
        No = Long.parseLong(nowDate) * 1000;
        //No = No + 1;
        return No;
    }
}
