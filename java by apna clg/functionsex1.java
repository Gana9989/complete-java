/*Print a Given name in a Function */
import java.util.*;

public class functionsex1 {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName("You entered name is: " + name);//Call kiya function
    }
}
