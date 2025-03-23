//Print numbers from 1 to 5

import java.util.Scanner;

public class Recursion1ex2 {

    public static void printNumbers(int n) {
        if (n == 6) {
            return;
        }

        System.out.println(n);
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        printNumbers(n);//n=1
    }

}
