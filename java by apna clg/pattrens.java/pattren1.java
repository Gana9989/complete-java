// Pattren of solid Rectangle

import java.util.Scanner;

public class pattren1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //outer loop
        for (int i = 1; i <= a; i++) {
            //inner loop
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }
}
