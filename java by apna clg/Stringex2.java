
public class Stringex2 {

    public static void main(String[] args) {
        //Concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;//tony@stark
        System.out.println(fullName.length());

        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
    }
}
