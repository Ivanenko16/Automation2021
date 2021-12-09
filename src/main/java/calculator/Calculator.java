package calculator;

import java.util.Scanner;

public class Calculator {

    private Integer result = 0;

    public String getOperation() {
        System.out.println("Enter operation: ");
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        if (operation.equalsIgnoreCase("q")) {
            quitMethod();
        }
        return operation;
    }

    public Integer getNumber() {
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void showMenu() {
        System.out.println("Calculator started.");
        System.out.println("+ Add");
        System.out.println("- Deduct");
        System.out.println("* Multiply");
        System.out.println("/ Divide");
        System.out.println("Q Quit");
        System.out.println("");
    }

    public void run() {
        System.out.println("Calculator  started");

        do {
            showMenu();
            String operation = getOperation();
            Integer number = getNumber();

            switch (operation) {
                case "+":
                    addMethod(number);
                    break;
                case "-":
                    deductMethod(number);
                    break;
                case "*":
                    multiplyMethod(number);
                    break;
                case "/":
                    divideMethod(number);
                    break;
                default:
                    System.out.println("Wrong operation!");
            }
            System.out.println("Result: " + result);
        } while (true);
    }

    public void addMethod(Integer i) {
        result = result + i;
    }

    public void deductMethod(Integer i) {
        result = result - i;
    }

    public void multiplyMethod(Integer i) {
        result = result * i;
    }

    public void divideMethod(Integer i) {
        result = result / i;
    }

    public void quitMethod() {
        System.exit(0);
    }
}
