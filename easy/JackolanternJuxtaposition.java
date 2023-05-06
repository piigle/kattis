import java.util.*;

public class JackolanternJuxtaposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 1;
        while (in.hasNextInt()) {
            product *= in.nextInt();
        }

        System.out.println(product);
    }
}
