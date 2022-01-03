package javaadvanced.task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReversValue {

    public static <K, V> Map<V, Collection<K>> reverse(Map<K, V> oldMap) {
        Map<V, Collection<K>> newMap = new HashMap<>();

        for (Map.Entry<K, V> entry : oldMap.entrySet()) {
            Collection<K> newVal;
            if (newMap.containsKey(entry.getValue())) {
                newVal = newMap.get(entry.getValue());
            } else {
                newVal = new HashSet<>();
            }
            newVal.add(entry.getKey());
            newMap.put(entry.getValue(), newVal);
        }
        return newMap;
    }
}
