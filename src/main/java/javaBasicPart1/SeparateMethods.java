package javaBasicPart1;

public class SeparateMethods {

    public static void sum(int x, int y) {
        int result = x + y;
        System.out.println("Sum: " + result);
    }

    public static void subtract(int x, int y) {
        int result = x - y;
        System.out.println("Subtract: " + result);
    }

    public static void divide(int x, int y) {
        int result = x / y;
        System.out.println("Divide: " + result);
    }

    public static void multiply(int x, int y) {
        int result = x * y;
        System.out.println("Multiply: " + result);
    }

    public static void reminder(int x, int y) {
        int result = x % y;
        System.out.println("Reminder: " + result);
    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }

    public static void duplicateElementsInArray(int[] arr) {
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}




