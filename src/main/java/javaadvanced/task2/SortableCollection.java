package javaadvanced.task2;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SortableCollection {

    static <V> void createSortableCollection(Collection<V> collection) {
        Set<V> set = new TreeSet<>(collection);
        for (V o : set) {
            System.out.println(o.toString());
        }
    }
}
