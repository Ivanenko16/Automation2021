package javaBasicPart1;

public class MainProgram extends SeparateMethods {
    public static void main(String[] args) {

        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        int number1 = 125;
        int number2 = 24;
        int[] arr = new int[]{5, 6, 7, 12, -5, 32, 43};
        int[] arr2 = {5,6,7,12,-5,32,43,6,12};

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        sum(number1, number2);
        subtract(number1, number2);
        multiply(number1, number2);
        divide(number1, number2);
        reminder(number1, number2);

        sumArray(arr);
        duplicateElementsInArray(arr2);
    }
}
