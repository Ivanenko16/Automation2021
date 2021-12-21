package javabasicpart1;

import java.util.Scanner;

public class PrintSumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int int1 = number1.nextInt();
        System.out.println("Please enter the second integer");
        Scanner number2 = new Scanner(System.in);
        int int2 = number2.nextInt();

        int sum = int1 + int2;
        System.out.println("Sum: " + sum);
    }
}

