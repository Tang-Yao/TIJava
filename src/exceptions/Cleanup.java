package exceptions;

/**
 * Created by ty on 2016/11/3.
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("F:\\ThinkingInJava\\src\\exceptions\\Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ;
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
