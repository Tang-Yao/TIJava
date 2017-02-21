package holding;

import java.time.Period;
import java.util.*;

/**
 * Created by ty on 2016/9/22.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);

        for(int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(10));
        }

        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);

        priorityQueue = new PriorityQueue<Integer>();
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCTION";
        List<String> strings = Arrays.asList(fact.split(""));

        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);

        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<String>(stringPQ.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }

        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ);
    }
}
