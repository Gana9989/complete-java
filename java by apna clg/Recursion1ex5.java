//To calculate fibanacci series
public class Recursion1ex5 {

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n - 2);
    }
}
