
public class Stringex4 {

    public static void main(String[] args) {
        //Substring(begining index, ending index)
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        String name2 = sentence.substring(0, 4);
        String name3 = sentence.substring(4);

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        //Strings are immutable
    }
}
