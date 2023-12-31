import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void GuessTheNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretnum = random.nextInt(100) + 1;

        int attempt = 1;
        do {
            System.out.println("Enter your number :");
            int num = sc.nextInt();
            attempt++;
            if (num == secretnum) {
                System.out.println("Congratulations! Your guess was right");

                if (attempt == 1) {
                    System.out.println("Score : 100");
                    break;
                } else if (attempt == 2) {
                    System.out.println("Score : 75");
                    break;
                } else if (attempt == 3) {
                    System.out.println("Score : 50");
                    break;
                } else if (attempt == 4) {
                    System.out.println("Score : 25");
                    break;
                } else if (attempt == 5) {
                    System.out.println("Score : 15");
                    break;
                }
            } else if (num > secretnum) {
                System.out.println("Your guess is high!");
            } else if (num < secretnum) {
                System.out.println("Your guess is low!");
            }
        } while (attempt <= 5);
        if (attempt > 5) {
            System.out.println("0 attempts left");
            System.out.println("The number was " + secretnum);
        }
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********NUMBER GAME********");
        System.out.println("Welcome To The Game Of Guess!!!");
        System.out.println(
                "Guess the number between 1 to 100 " + "\n" + "You have 5 attempts" + "\n" + "BEST OF LUCK!!!");
        GuessTheNumber();
        System.out.println("Do you want to play again. " + " 1. Yes" + "  2. No");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                GuessTheNumber();
                break;
            case 2:
                System.out.println("Exit");
                break;
        }
        sc.close();

    }
}
