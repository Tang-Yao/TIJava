package holding;

import net.mindview.util.Stack;

/**
 * Created by ty on 2016/9/21.
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        for(String s : "my dog has fleas".split(" ")) {
            stack.push(s);
        }

        while(!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
