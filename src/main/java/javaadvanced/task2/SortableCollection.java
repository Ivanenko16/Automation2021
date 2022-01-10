package javaadvanced.task2;

import java.util.Collection;
import java.util.TreeSet;

public class SortableCollection {

    public static <T> Collection<T> createSortableCollection(Collection<T> collection) {
        return new TreeSet<>(collection);
    }
}
