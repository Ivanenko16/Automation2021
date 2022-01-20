package streams.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Run {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("TestData");
            int length = fileInputStream.available();
            byte[] data = new byte[length];
            fileInputStream.read(data);
            String text = new String(data);

            List<String> listWithWordsStartO = Arrays.stream(text.split(" "))
                    .filter(word -> word.toLowerCase().startsWith("o"))
                    .collect(Collectors.toList());

            System.out.println(listWithWordsStartO);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert fileInputStream != null;
            fileInputStream.close();
        }
    }
}
