package QueueComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bob");
        names.add("greg");
        names.add("bart");

        names.sort(Comparator.naturalOrder());
        names.forEach(System.out::println);

    }
}
