package javaBasicPart2;

public class Main {
    public static void main(String[] args) {
//  1. Write a Java program to concatenate a given string to the end of another string.
//  And remove all `P` or `p` characters.

        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2).replace("P", "");
        System.out.println(str3);
    }


}
