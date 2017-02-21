package exceptions;

import static myself.Print.print;

/**
 * Created by ty on 2016/9/26.
 */

public class ExceptionMethods {
    public static void main(String [] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            print("Caught Exception");
            print("getMessage(): " + e.getMessage());
            print("getLocalizedMessage(): " + e.getLocalizedMessage());
            print("toString(): " + e);
            print("printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}
