package QueueComparator;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
    public static void main(String[] args) {
        Deque<String> persons = new ArrayDeque<>();
        persons.offerFirst("man1");
        persons.offerFirst("man2");
        persons.offerFirst("man3");
        persons.offerLast("woman1");
        persons.offerLast("woman2");
        persons.offerLast("woman3");

        String firstMan = persons.pollFirst();
        String firstWoman = persons.pollLast();

        while ( firstMan != null && firstWoman != null){
            System.out.println("couple : " + firstMan + " and " + firstWoman);
            firstMan = persons.pollFirst();
            firstWoman = persons.pollLast();
        }
    }
}
