//This code is to print subseuances of a string

public class Recursion2ex7 {

    public static void printSubseq(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        // choose
        printSubseq(str, idx + 1, newString + str.charAt(idx));
        // don't choose
        printSubseq(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str1, 0, "");
        printSubseq(str2, 0, "");
    }
}
