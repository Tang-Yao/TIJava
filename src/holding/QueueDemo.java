package holding;

import net.mindview.util.CountingGenerator;

import java.util.*;

/**
 * Created by Administrator on 2016/9/21.
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println();
    }

    public static void main(String [] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(470);
        for(int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i+10));
        }

        printQ(queue);

        Queue<Character> qc = new LinkedList<Character>();

        for(char c : "Braontosaurus".toCharArray()) {
            qc.offer(c);
        }

        printQ(qc);
    }
}

