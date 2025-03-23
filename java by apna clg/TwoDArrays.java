
import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int coloumns = sc.nextInt();

        int[][] numbers = new int[rows][coloumns];

        //input
        //Rows
        for (int i = 0; i < rows; i++) {
            //Coloumns
            for (int j = 0; j < coloumns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
