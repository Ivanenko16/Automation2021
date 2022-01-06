package javaadvanced.task2;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SortableCollection {

    static <T> void createSortableCollection(Collection<T> collection) {
        Set<T> set = new TreeSet<>(collection);
        for (T o : set) {
            System.out.println(o.toString());
        }
    }
}
