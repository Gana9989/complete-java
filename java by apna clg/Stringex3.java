
public class Stringex3 {

    public static void main(String[] args) {
        //Compare
        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //s3 s1 < s2 : -ve value
        //Method - 1: 
        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        //Method - 2:
        // if (name1 == name2) {//Dont use == to compare strings
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        //Method - 3:
        if (name1.equals(name2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
