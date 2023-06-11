import java.util.*;

public class Planina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    

        long iterations = in.nextLong();
        System.out.println((long)Math.pow(Math.pow(2, iterations)+1, 2));
    }
}
