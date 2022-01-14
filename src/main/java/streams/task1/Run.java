package streams.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Run {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("TestData");
        int length = fileInputStream.available();
        byte[] data = new byte[length];
        fileInputStream.read(data);
        String text = new String(data);

        List<String> listWithAllWords = returnListWithAllWords(text);
        List<String> listWithWordsStartO = listWithAllWords.stream()
                .filter(word -> word.toLowerCase().startsWith("o"))
                .collect(Collectors.toList());

        System.out.println(listWithWordsStartO);
    }

    static List<String> returnListWithAllWords(String inputString) {
        return new ArrayList<>(Arrays.asList(inputString.split(" ")));
    }
}
