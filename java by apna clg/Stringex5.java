
public class Stringex5 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charAt index 0
        // System.out.println(sb.charAt(0));
        //Set char at index 0 
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);
        //insert s at index 0
        // sb.insert(0, 's');
        // System.out.println(sb);
        //insert n at index 2
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the extra n
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
