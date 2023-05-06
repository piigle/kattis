import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myYell = in.next();
        String doctorYell = in.next();
        
        if (myYell.length() >= doctorYell.length())
            System.out.println("go");
        else
            System.out.println("no");
    }
}
