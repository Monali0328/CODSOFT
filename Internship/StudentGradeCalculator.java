import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****STUDENT GRADE CALCULATOR*****");
        System.out.println("Enter total number of subjects:");
        int sub = sc.nextInt();
        System.out.println("Enter the marks for each subject:");
        int marks = 0;
        float sum = 0;
        float avg;
        for (int i = 1; i <= sub; i++) {
            marks = sc.nextInt();
            sum = sum + marks;

        }
        avg = sum / sub;

        System.out.println("Total marks :" + sum);
        System.out.println("Average Percentage:" + String.format("%.2f", avg) + " %");
        if (avg >= 95 && avg <= 100) {
            System.out.println("Grade: A++");
        } else if (avg >= 85 && avg < 95) {
            System.out.println("Grade : A");
        } else if (avg >= 75 && avg < 85) {
            System.out.println("Grade : B");
        } else if (avg >= 60 && avg < 75) {
            System.out.println("Grade : C");
        } else if (avg >= 45 && avg < 60) {
            System.out.println("Grade : D");
        } else if (avg >= 35 && avg < 45) {
            System.out.println("Grade : P");
        } else if (avg < 35) {
            System.out.println("Grade : Fail");
        }

    }

}
