package guessinggame;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public void startGame() {
        System.out.println("Guessing game started!");
        int random = ThreadLocalRandom.current().nextInt(0, 50 + 1);
        do {
            int userNumber = getNumber();
            if (random > userNumber) {
                System.out.println("My number is bigger.");
            } else if (random < userNumber) {
                System.out.println("My number is smaller");
            } else {
                System.out.println("You winner!");
                break;
            }
        } while (true);
    }

    private Integer getNumber() {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
