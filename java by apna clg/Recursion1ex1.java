//Print numbers from 5 to 1

import java.util.Scanner;

public class Recursion1ex1 {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        printNumbers(n);//n=5
    }

}
