package javabasicpart2;

public class Main extends NumberHolder {
    public static void main(String[] args) {
        //  1. Write a Java program to concatenate a given string to the end of another string.
        //  And remove all `P` or `p` characters.
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2).replace("P", "").replace("p", "");
        System.out.println(str3);

        //	2. Create two auxiliary object of Computer class.
        Computer computer1 = new Computer("Apple", "1920*1080");
        Computer computer2 = new Computer("Xiaomi", "1680*1050");

        //  3. What's wrong with the following program? Fix the program called SomethingIsWrong.
        Rectangle myRect = new Rectangle(50, 40);
        System.out.println("myRect's area is " + myRect.getArea());

        //  4. Given the following class, called NumberHolder, write some code that creates an instance of the class,
        //  initializes its two member variables, and then displays the value of each member variable.
        NumberHolder numberHolder = new NumberHolder();

        System.out.println(numberHolder.getAFloat());
        System.out.println(numberHolder.getAnInt());
    }
}
