package javaadvanced.task2;

import java.util.ArrayList;
import java.util.List;

public class Run extends SortableCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str1");

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        createSortableCollection(list);
        createSortableCollection(list1);
    }
}
