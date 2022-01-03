package javaadvanced.task1;

import java.io.FileInputStream;
import java.io.IOException;

import static javaadvanced.task1.CharacterCount.characterCount;

public class Run {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("TestText");
        int length = fileInputStream.available();
        byte[] data = new byte[length];
        fileInputStream.read(data);
        String text = new String(data);

        characterCount(text);
    }
}