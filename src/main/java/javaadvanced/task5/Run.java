package javaadvanced.task5;

import java.util.*;

public class Run {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        List<String> values = new ArrayList<>();
        values.add("Andrey");
        values.add("Andrey");
        values.add("Ivan");
        values.add("Katya");
        values.add("Dasha");
        values.add("Dasha");
        values.add("Dasha");
        values.add("Dasha");

        System.out.println(returnSortedMap(numbers, values));
        System.out.println(returnSortedMapThrowException(numbers, values));
    }

    public static <K, V> Map<K, V> returnSortedMap(List<K> keys, List<V> values) {
        Map<K, V> map = new HashMap<>();

        Iterator<K> keyIterator = keys.iterator();
        Iterator<V> valueIterator = values.iterator();

        while (keyIterator.hasNext()) {
            if (valueIterator.hasNext()) {
                map.put(keyIterator.next(), valueIterator.next());
            } else {
                map.put(keyIterator.next(), null);
            }
        }
        return map;
    }

    public static <K, V> Map<K, V> returnSortedMapThrowException(List<K> keys, List<V> values) {
        if (keys.size() > values.size()) {
            throw new IndexOutOfBoundsException("Value is not enough for map");
        }
        if (keys.size() < values.size()) {
            throw new IndexOutOfBoundsException("Key is not enough for map");
        }

        Map<K, V> map = new HashMap<>();

        Iterator<K> keyIterator = keys.iterator();
        Iterator<V> valueIterator = values.iterator();

        while (keyIterator.hasNext()) {
            map.put(keyIterator.next(), valueIterator.next());
        }
        return map;
    }
}