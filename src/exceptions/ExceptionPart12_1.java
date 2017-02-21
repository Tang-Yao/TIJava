package exceptions;

/**
 * Created by ty on 2016/9/26.
 */
public class ExceptionPart12_1 {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Throwing main method Exception : ");
            throw new Exception("Hello world");
        } catch (Exception e) {
            System.out.println("catch the Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is the finaly.");
        }
    }
}
