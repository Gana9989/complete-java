/*String append usage */
public class Stringex6 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");//str = str + "e";
        sb.append("l");//str = str + "l"
        sb.append("l");//str = str + "l"
        sb.append("o");//str = str + "o"

        System.out.println(sb.length());
    }
}
