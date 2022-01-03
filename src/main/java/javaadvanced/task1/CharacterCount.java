package javaadvanced.task1;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    static void characterCount(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toLowerCase().replaceAll("\\s", "").
                replaceAll("'", "").toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        charCountMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
