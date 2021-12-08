package javaBasicPart2;

public class Main extends NumberHolder{
    public static void main(String[] args) {
//  1. Write a Java program to concatenate a given string to the end of another string.
//  And remove all `P` or `p` characters.

        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2).replace("P", "");
        System.out.println(str3);

//  4. Given the following class, called NumberHolder, write some code that creates an instance of the class,
//  initializes its two member variables, and then displays the value of each member variable.
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.aFloat = 3.75f;
        numberHolder.anInt = 12;

        System.out.println(numberHolder.aFloat);
        System.out.println(numberHolder.anInt);
    }
}
