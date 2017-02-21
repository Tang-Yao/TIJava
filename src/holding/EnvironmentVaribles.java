package holding;

import java.util.Map;

/**
 * Created by ty on 2016/9/23.
 */
public class EnvironmentVaribles {
    public static void main(String [] args) {
        for(Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
