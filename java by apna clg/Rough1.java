import java.util.Scanner;

/**
 * Rough1
 */
public class Rough1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of ");
        int Percentage = sc.nextInt();
        int Attendance = sc.nextInt();

        if (Percentage >= 95) {
            if (Attendance >= 90) {
                System.out.println("Congratulations!!!");
                System.out.println("You are eligible for this job as a Higher integrated soft ware engineer");
            } else if (Percentage >= 85) {
                if (Attendance >= 75) {
                    System.out.println("Congratulations!!!");
                    System.out.println("You are eligible for this job as security manager");
                }
            } else if (Percentage >= 75) {
                if (Attendance >= 60) {
                    System.out.println("Congratulations!!!");
                    System.out.println("You are eligible for this job as a junior software Engineer");
                }
            } else {
                System.out.println("Sorry!!!");
                System.out.println("You are not eligible for this job");
            }
        }
    }
}