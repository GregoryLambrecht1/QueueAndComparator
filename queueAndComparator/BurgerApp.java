package QueueComparator;

import java.util.LinkedList;
import java.util.Queue;

public class BurgerApp {
    public static void main(String[] args) {

        BurgerOrder burger1 = new BurgerOrder("greg",1);
        BurgerOrder burger2 = new BurgerOrder("tom",2);
        BurgerOrder burger3 = new BurgerOrder("bob",3);


        Queue<BurgerOrder> queue = new LinkedList<>();
        queue.offer(burger1);
        queue.offer(burger2);
        queue.offer(burger3);

        BurgerOrder nextPerson = queue.peek();

        while(nextPerson != null){
            System.out.println("gonna handle : " + nextPerson);
            nextPerson = queue.poll();
            System.out.println("handling : " + nextPerson);
            nextPerson = queue.peek();
        }



    }
}
