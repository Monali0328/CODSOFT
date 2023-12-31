
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {

    static int Quiz_Duration = 5;
    static Timer timer;
    static boolean timerExpired;

    public static void startTimer() {
        timerExpired = false;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            int timeLeft = Quiz_Duration;

            public void run() {
                System.out.println("Time remaining: " + timeLeft + " seconds");
                timeLeft--;

                if (timeLeft < 0) {
                    stopTimer();
                    timerExpired = true;
                    System.out.println("Enter 1 for next question");

                }
            }
        }, 0, 2000);

    }

    public static void stopTimer() {
        timer.cancel();

    }

    public static void startQuiz() {
        Scanner sc = new Scanner(System.in);

        int correct = 0;
        int wrong = 0;

        String Que[] = { "A]What is the capital of India?", "B]Is 43 divisible by 5?",
                "C]Which is the closest planet to the sun?" };
        String Options[][] = { { "New Delhi", "Mumbai", "Ahemdabad", "Indore" },
                { "Yes", "No", "Cannot determine" },
                { "Mars", "Neptune", "Jupiter", "Mercury" } };
        int ans[] = { 1, 2, 4 };

        for (int i = 0; i < Que.length; i++) {
            System.out.println(Que[i]);

            for (int j = 0; j < Options[i].length; j++) {
                System.out.println((j + 1) + ". " + Options[i][j]);
            }
            startTimer();
            int n = sc.nextInt();
            stopTimer();

            if (timerExpired == true) {
                System.out.println("Time was out. Try next Question");

            }

            if (n == ans[i]) {
                correct++;
            } else {
                wrong++;
            }

        }
        System.out.println("Correct :" + correct + "\nwrong :" + wrong);
        sc.close();
    }

    public static void main(String args[]) {
        System.out.println(
                "There are 3 questions ." + "\nYou have 10 sec to answer each question." + "\n ALL THE BEST!!!");

        startQuiz();
    }
}
