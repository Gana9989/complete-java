//Sum of n natursal numbers

public class Recursion1ex3 {

    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println("Sum of n digit numbers is: " + sum);
            return;
        }

        sum += n;
        printSum(n - 1, sum);
    }

    public static void main(String[] args) {
        printSum(5, 0);
    }
}
