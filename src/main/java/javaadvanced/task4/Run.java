package javaadvanced.task4;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        String[] orders = new String[8];
        orders[0] = "Order1";
        orders[1] = "Order1";
        orders[2] = "Order2";
        orders[3] = "Order3";
        orders[4] = "Order4";
        orders[5] = "Order5";
        orders[6] = "Order5";
        orders[7] = "Order5";

        System.out.println("List of HashSet:");
        HashSet<String> orderHashSet = new HashSet<>(Arrays.asList(orders));
        for (String str : orderHashSet) {
            System.out.println(str);
        }

        System.out.println("List of TreeSet:");
        TreeSet<String> orderTreeSet = new TreeSet<>(Arrays.asList(orders));
        for (String str : orderTreeSet) {
            System.out.println(str);
        }
    }
}
