package javaBasicPart2;

public class SomethingIsWrong extends Rectangle {


    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.weight = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }


}
