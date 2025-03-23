// Picture of hollow rectangle

import java.util.Scanner;

public class pattren2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // outer loop
        for (int i = 1; i <= a; i++) {
            // inner loop
            for (int j = 1; j <= b; j++) {
                // condition to print the pattern
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // to move to next row
        }
    }
}
