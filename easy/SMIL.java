import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.next();
        for (int i = 0; i < data.length()-1; i++) {
            if (data.charAt(i) == ':' || data.charAt(i) == ';') {
                if (data.charAt(i+1) == ')') // :) or ;)
                    System.out.println(i);
                else if (data.charAt(i+1) == '-') // :-) or ;-)
                    if (i < data.length()-2 && data.charAt(i+2) == ')')
                        System.out.println(i);
            }
        }
    }
}
