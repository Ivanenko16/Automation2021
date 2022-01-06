package javaadvanced.task2;

import java.util.Collection;
import java.util.TreeSet;

public class SortableCollection {

    static <T> Collection createSortableCollection(Collection<T> collection) {
        return new TreeSet<>(collection);
    }
}
