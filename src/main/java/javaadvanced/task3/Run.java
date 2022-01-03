package javaadvanced.task3;

import java.util.HashMap;
import java.util.Map;

public class Run {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "a");
        map.put(3, "b");
        map.put(4, "b");
        System.out.println("Before Reversing \n" + map);


        System.out.println("After Reversing \n" + ReversValue.reverse(map));
    }
}
